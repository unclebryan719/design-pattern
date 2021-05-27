package com.unclebryan.prototype.deepclone;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;

/**
 * @program: design-pattern
 * @description:
 * @author: UncleBryan
 * @created: 2021/05/28 00:10
 */
@NoArgsConstructor
@Data
public class DeepProtoType implements Serializable, Cloneable {
    public String name;
    public DeepCloneableTarget deepCloneableTarget;

    public Object deepClone(){
        Object obj = null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        ByteArrayInputStream byteArrayInputStream = null;
        ObjectOutputStream objectOutputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            //序列化
            byteArrayOutputStream = new ByteArrayOutputStream();
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);

            //反序列化
            byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            objectInputStream = new ObjectInputStream(byteArrayInputStream);
            obj = objectInputStream.readObject();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                byteArrayOutputStream.close();
                objectOutputStream.close();
                byteArrayInputStream.close();
                objectInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return obj;
    }
}
