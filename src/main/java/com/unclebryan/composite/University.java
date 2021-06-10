package com.unclebryan.composite;

import com.google.common.collect.Lists;
import lombok.*;

import java.util.Collections;
import java.util.List;

/**
 * @program: design-pattern
 * @description: 大学
 * @author: UncleBryan
 * @created: 2021/06/03 20:50
 */
public class University extends OrganizationComponent{
    List<OrganizationComponent> organizationComponents = Lists.newArrayList();

    public University(String name, String description) {
        super(name, description);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    @Override
    protected void print() {
        System.out.println("========="+getName()+"==========");
        //遍历
        for(OrganizationComponent organizationComponent : organizationComponents){
            organizationComponent.print();
        }
    }
}
