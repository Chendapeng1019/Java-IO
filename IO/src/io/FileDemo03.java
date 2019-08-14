package io;

import java.io.File;

/**
 * @ClassName FileDemo01
 * @Description
 * @Author chendapeng
 * @Date 2019/5/18
 **/
public class FileDemo03 {

    public static void main(String[] args) {

        File src = new File("G:/Java/IO/IMG_20140519_180900.jpg");

        System.out.println("名称："+src.getName());
        System.out.println("路劲："+src.getPath());
        System.out.println("绝对路劲："+src.getAbsolutePath());
        System.out.println("父路径："+src.getParent());
    }
}
