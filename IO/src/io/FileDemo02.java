package io;

import java.io.File;

/**
 * @ClassName FileDemo01
 * @Description
 * @Author chendapeng
 * @Date 2019/5/18
 **/
public class FileDemo02 {

    public static void main(String[] args) {

        String path ="G:/Java/IO/IMG_20140519_180900.jpg";

        //绝对路径
        File src = new File(path);
        System.out.println(src.getAbsolutePath());

        System.out.println(System.getProperty("user.dir"));

        //相对路劲
        src = new File("IMG_20140519_180900.jpg");
        System.out.println(src.getAbsolutePath());
    }
}
