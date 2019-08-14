package io;

import java.io.File;

/**
 * @ClassName FileDemo01
 * @Description
 * @Author chendapeng
 * @Date 2019/5/18
 **/
public class FileDemo01 {

    public static void main(String[] args) {

        String path ="G:/Java/IO/IMG_20140519_180900.jpg";

        //构建File对象
        File src = new File(path);
        System.out.println(src.length());


        //2.构建File对象
        src = new File("G:/Java/IO","IMG_20140519_180900.jpg");
        System.out.println(src.length());
    }
}
