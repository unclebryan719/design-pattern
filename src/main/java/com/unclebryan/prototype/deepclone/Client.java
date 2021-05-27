package com.unclebryan.prototype.deepclone;

/**
 * @program: design-pattern
 * @description:
 * @author: UncleBryan
 * @created: 2021/05/27 22:50
 */
public class Client {
    public static void main(String[] args) {
        DeepProtoType protoType = new DeepProtoType();
        protoType.name="宋江";
        protoType.deepCloneableTarget = new DeepCloneableTarget("大牛","大牛的类");
        DeepProtoType protoType2 = (DeepProtoType) protoType.deepClone();
        System.out.println(protoType+":"+protoType.getDeepCloneableTarget().hashCode());
        System.out.println(protoType2+":"+protoType2.getDeepCloneableTarget().hashCode());
    }
}
