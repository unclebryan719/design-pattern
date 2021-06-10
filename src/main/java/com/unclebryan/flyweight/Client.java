package com.unclebryan.flyweight;

/**
 * @program: design-pattern
 * @description:
 * @author: UncleBryan
 * @created: 2021/06/10 21:44
 */
public class Client {
    public static void main(String[] args) {
        //创建一个工厂类
        WebsiteFactory websiteFactory = new WebsiteFactory();

//        客户要获取一个新闻形式发布的网站
        Website website1 = websiteFactory.getWebsiteCategory("新闻");
        Website website2 = websiteFactory.getWebsiteCategory("博客");
        Website website3 = websiteFactory.getWebsiteCategory("新闻");
        Website website4 = websiteFactory.getWebsiteCategory("视频");

        website1.use(User.builder().name("张三").build());
        website2.use(User.builder().name("李四").build());
        website3.use(User.builder().name("王五").build());
        website4.use(User.builder().name("赵六").build());

        System.out.println("网站的分类共"+websiteFactory.getWebsiteCount());
    }
}
