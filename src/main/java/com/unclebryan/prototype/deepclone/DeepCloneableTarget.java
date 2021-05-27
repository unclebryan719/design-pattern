package com.unclebryan.prototype.deepclone;

import lombok.AllArgsConstructor;

import java.io.Serializable;

/**
 * @program: design-pattern
 * @description:
 * @author: UncleBryan
 * @created: 2021/05/28 00:08
 */
@AllArgsConstructor
public class DeepCloneableTarget implements Serializable, Cloneable {
    private String cloneName;
    private String cloneClass;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
