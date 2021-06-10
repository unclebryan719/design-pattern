package com.unclebryan.flyweight;

/**
 * @program: design-pattern
 * @description:
 * @author: UncleBryan
 * @created: 2021/06/10 21:30
 */
public class ConcretWebsite extends Website{
    private String type = "";

    public ConcretWebsite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站的发布形式为："+type+",用户"+user.getName()+"正在使用中....");
    }
}
