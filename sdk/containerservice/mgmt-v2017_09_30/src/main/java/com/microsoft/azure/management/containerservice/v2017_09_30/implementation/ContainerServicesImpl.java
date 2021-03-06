/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.containerservice.v2017_09_30.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.containerservice.v2017_09_30.ContainerServices;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.containerservice.v2017_09_30.OrchestratorVersionProfileListResult;

class ContainerServicesImpl extends WrapperImpl<ContainerServicesInner> implements ContainerServices {
    private final ContainerServiceManager manager;

    ContainerServicesImpl(ContainerServiceManager manager) {
        super(manager.inner().containerServices());
        this.manager = manager;
    }

    public ContainerServiceManager manager() {
        return this.manager;
    }

    @Override
    public Observable<OrchestratorVersionProfileListResult> listOrchestratorsAsync(String location) {
        ContainerServicesInner client = this.inner();
        return client.listOrchestratorsAsync(location)
        .map(new Func1<OrchestratorVersionProfileListResultInner, OrchestratorVersionProfileListResult>() {
            @Override
            public OrchestratorVersionProfileListResult call(OrchestratorVersionProfileListResultInner inner) {
                return new OrchestratorVersionProfileListResultImpl(inner, manager());
            }
        });
    }

}
