package com.unclebryan.flyweight;

import lombok.Builder;
import lombok.Data;

/**
 * @program: design-pattern
 * @description: 享元模式的外部状态
 * @author: UncleBryan
 * @created: 2021/06/10 21:52
 */
@Data
@Builder
public class User {
    private String name;
}
