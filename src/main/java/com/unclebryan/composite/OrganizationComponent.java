package com.unclebryan.composite;

import lombok.*;

/**
 * @program: design-pattern
 * @description:
 * @author: UncleBryan
 * @created: 2021/06/03 20:42
 */
@Setter
@Getter
@AllArgsConstructor
public abstract class OrganizationComponent {
    private String name;

    private String description;

    protected void add(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException();
    }

    protected void remove(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException();
    }

    /**
     * 抽象类，子类需要实现
     */
    protected abstract void print();
}
