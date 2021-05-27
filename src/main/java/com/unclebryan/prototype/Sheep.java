package com.unclebryan.prototype;

import lombok.*;

/**
 * @program: design-pattern
 * @description:
 * @author: UncleBryan
 * @created: 2021/05/27 22:47
 */
@Data
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Sheep implements Cloneable{
    private String name;
    private int age;
    private Sheep friend;
    @Override
    protected Object clone() {
        Sheep sheep = null;
        try {
            sheep = (Sheep) super.clone();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return sheep;
    }
}
