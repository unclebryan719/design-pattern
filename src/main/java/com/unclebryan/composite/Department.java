package com.unclebryan.composite;

import com.google.common.collect.Lists;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @program: design-pattern
 * @description: 院系
 * @author: UncleBryan
 * @created: 2021/06/03 20:51
 */
public class Department extends OrganizationComponent{
    List<OrganizationComponent> organizationComponents = Lists.newArrayList();

    public Department(String name, String description) {
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
