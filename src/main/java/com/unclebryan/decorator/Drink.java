package com.unclebryan.decorator;

import lombok.Data;

/**
 * @program: design-pattern
 * @description:
 * @author: UncleBryan
 * @created: 2021/06/01 22:38
 */
@Data
public abstract class Drink {
    private float price;
    private String description;

    public abstract float cost();

}
