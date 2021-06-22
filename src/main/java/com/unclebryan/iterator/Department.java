package com.unclebryan.iterator;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @program: design-pattern
 * @description: 组织-学院、专业等
 * @author: UncleBryan
 * @created: 2021/06/11 22:12
 */
@Data
@AllArgsConstructor
public class Department {
    private String name;
    private String description;
}
