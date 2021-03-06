/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.deploymentmanager.v2019_11_01_preview.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.deploymentmanager.v2019_11_01_preview.Steps;
import com.microsoft.azure.management.deploymentmanager.v2019_11_01_preview.StepResource;
import rx.Observable;
import rx.Completable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.azure.arm.resources.ResourceUtilsCore;
import com.microsoft.azure.arm.utils.RXMapper;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;

class StepsImpl extends GroupableResourcesCoreImpl<StepResource, StepResourceImpl, StepResourceInner, StepsInner, DeploymentManagerManager>  implements Steps {
    protected StepsImpl(DeploymentManagerManager manager) {
        super(manager.inner().steps(), manager);
    }

    @Override
    protected Observable<StepResourceInner> getInnerAsync(String resourceGroupName, String name) {
        StepsInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        StepsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public Observable<String> deleteByIdsAsync(Collection<String> ids) {
        if (ids == null || ids.isEmpty()) {
            return Observable.empty();
        }
        Collection<Observable<String>> observables = new ArrayList<>();
        for (String id : ids) {
            final String resourceGroupName = ResourceUtilsCore.groupFromResourceId(id);
            final String name = ResourceUtilsCore.nameFromResourceId(id);
            Observable<String> o = RXMapper.map(this.inner().deleteAsync(resourceGroupName, name), id);
            observables.add(o);
        }
        return Observable.mergeDelayError(observables);
    }

    @Override
    public Observable<String> deleteByIdsAsync(String...ids) {
        return this.deleteByIdsAsync(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public void deleteByIds(Collection<String> ids) {
        if (ids != null && !ids.isEmpty()) {
            this.deleteByIdsAsync(ids).toBlocking().last();
        }
    }

    @Override
    public void deleteByIds(String...ids) {
        this.deleteByIds(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public PagedList<StepResource> listByResourceGroup(String resourceGroupName) {
        StepsInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<StepResource> listByResourceGroupAsync(String resourceGroupName) {
        StepsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMap(new Func1<Page<StepResourceInner>, Observable<StepResourceInner>>() {
            @Override
            public Observable<StepResourceInner> call(Page<StepResourceInner> innerPage) {
                return Observable.from(innerPage.items());
            }
        })
        .map(new Func1<StepResourceInner, StepResource>() {
            @Override
            public StepResource call(StepResourceInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public StepResourceImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    protected StepResourceImpl wrapModel(StepResourceInner inner) {
        return  new StepResourceImpl(inner.name(), inner, manager());
    }

    @Override
    protected StepResourceImpl wrapModel(String name) {
        return new StepResourceImpl(name, new StepResourceInner(), this.manager());
    }

}
