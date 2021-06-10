package com.unclebryan.template;

import lombok.extern.slf4j.Slf4j;

import java.time.Duration;
import java.time.Instant;

/**
 * @program: design-pattern
 * @description: 豆浆
 * @author: UncleBryan
 * @created: 2021/06/10 23:43
 */
@Slf4j
public abstract class SoyaMilk {
    /**
     * 模板方法做成final的，不让子类覆盖
     */
    final void make(){
        Instant start = Instant.now();
        log.info("开始时间：{}",start);
        select();
        addCondiments();
        soak();
        beat();
        Instant end = Instant.now();
        log.info("开始时间：{}",end);
        log.info("花费时间/ms：{}", Duration.between(start,end).toMillis());
    };

    /**
     * 选材料
     */
    void select(){
        System.out.println("选择好的新鲜黄豆");
    }

    /**
     * 钩子方法-添加不同的配料，抽象方法，子类具体实现
     */

    void addCondiments(){

    };

    /**
     * 浸泡
     */
    void soak(){
        System.out.println("黄豆和配料开始浸泡，需要3小时 ");
    }

    /**
     * 搅碎
     */
    void beat(){
        System.out.println("黄豆和配料去豆浆机搅碎 ");
    }

}
