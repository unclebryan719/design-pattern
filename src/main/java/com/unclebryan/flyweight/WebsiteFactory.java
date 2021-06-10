package com.unclebryan.flyweight;

import java.util.Collections;
import java.util.HashMap;

/**
 * @program: design-pattern
 * @description: 网站工厂类，根据需要返回一个网站
 * @author: UncleBryan
 * @created: 2021/06/10 21:37
 */
public class WebsiteFactory {
    // 集合，充当池的作用
    private HashMap<String, ConcretWebsite> pool = new HashMap<>();

    public Website getWebsiteCategory(String type){
        if(!pool.containsKey(type)){
            pool.put(type, new ConcretWebsite(type));
        }
        return pool.get(type);
    }

    //获取网站分类的总数
    public int getWebsiteCount(){
        return pool.size();
    }
}
