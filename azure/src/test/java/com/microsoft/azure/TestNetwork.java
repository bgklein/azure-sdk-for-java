/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.microsoft.azure;

import org.junit.Assert;

import com.microsoft.azure.management.network.Network;
import com.microsoft.azure.management.network.NetworkSecurityGroup;
import com.microsoft.azure.management.network.NetworkSecurityGroups;
import com.microsoft.azure.management.network.Networks;
import com.microsoft.azure.management.network.Subnet;
import com.microsoft.azure.management.resources.fluentcore.arm.Region;

/**
 * Test of virtual network management.
 */
public class TestNetwork extends TestTemplate<Network, Networks> {

    private final NetworkSecurityGroups nsgs;
    TestNetwork(NetworkSecurityGroups nsgs) {
        this.nsgs = nsgs;
    }

    @Override
    public Network createResource(Networks networks) throws Exception {
        final String newName = "net" + this.testId;
        Region region = Region.US_WEST;
        String groupName = "rg" + this.testId;

        // Create an NSG
        NetworkSecurityGroup nsg = nsgs.define("nsg" + this.testId)
                .withRegion(region)
                .withNewGroup(groupName)
                .create();

        // Create a network
        return networks.define(newName)
                .withRegion(region)
                .withNewGroup(groupName)
                .withAddressSpace("10.0.0.0/28")
                .withSubnet("subnetA", "10.0.0.0/29")
                .defineSubnet("subnetB")
                    .withAddressPrefix("10.0.0.8/29")
                    .withExistingNetworkSecurityGroup(nsg.id())
                    .attach()
                .create();
    }

    @Override
    public Network updateResource(Network resource) throws Exception {
        resource =  resource.update()
                .withTag("tag1", "value1")
                .withTag("tag2", "value2")
                .withAddressSpace("141.25.0.0/16")
                .withSubnet("subnetC", "141.25.0.0/29")
                .withoutSubnet("subnetA")
                .updateSubnet("subnetB")
                    .withAddressPrefix("141.25.0.8/29")
                    .parent()
                .apply();
        Assert.assertTrue(resource.tags().containsKey("tag1"));

        return resource;
    }

    @Override
    public void print(Network resource) {
        StringBuilder info = new StringBuilder();
        info.append("Network: ").append(resource.id())
                .append("Name: ").append(resource.name())
                .append("\n\tResource group: ").append(resource.resourceGroupName())
                .append("\n\tRegion: ").append(resource.region())
                .append("\n\tTags: ").append(resource.tags())
                .append("\n\tAddress spaces: ").append(resource.addressSpaces())
                .append("\n\tDNS server IPs: ").append(resource.dnsServerIPs());

        // Output subnets
        for (Subnet subnet : resource.subnets().values()) {
            info.append("\n\tSubnet: ").append(subnet.name())
                .append("\n\t\tAddress prefix: ").append(subnet.addressPrefix())
                .append("\n\tAssociated NSG: ");

            NetworkSecurityGroup nsg;
            try {
                nsg = subnet.networkSecurityGroup();
            } catch (Exception e) {
                nsg = null;
            }

            if (null == nsg) {
                info.append("(None)");
            } else {
                info.append(nsg.id());
            }
        }

        System.out.println(info.toString());
    }
}
