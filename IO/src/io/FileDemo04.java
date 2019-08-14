package io;

import java.io.File;

/**
 * @ClassName FileDemo01
 * @Description 文件的状态
 * 1.不存在 exists
 * 2. 存在
 * 文件：isFile
 * 文件夹：isDirectory
 * @Author chendapeng
 * @Date 2019/5/18
 **/
public class FileDemo04 {

    public static void main(String[] args) {

        File src = new File("G:/Java/IO/IMG_20140519_180900.jpg");

        System.out.println("是否存在：" + src.exists());
        System.out.println("是否文件：" + src.isFile());
        System.out.println("是否文件夹：" + src.isDirectory());

        System.out.println("-----------------------");
        src = new File("G:/Java");
        System.out.println("是否存在：" + src.exists());
        System.out.println("是否文件：" + src.isFile());
        System.out.println("是否文件夹：" + src.isDirectory());

        src = new File("xxxxx");
        if (null == src || !src.exists()) {
            System.out.println("文件不存在！");
        } else {
            if (src.isFile()) {
                System.out.println("文件操作");
            } else {
                System.out.println("文件夹操作");
            }
        }

    }
}
