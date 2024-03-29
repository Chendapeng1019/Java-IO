package io;

import java.io.File;

/**
 * @ClassName DirDemo01
 * @Description
 * 创建目录
 * 1. mkdir():确保上级目录存在 ，不存在创建失败
 * 2. mkdirs():上级目录可以不存在，不存在一同来创建
 * @Author chendapeng
 * @Date 2019/5/19
 **/
public class DirDemo01 {
    public static void main(String[] args) {
        File  dir = new File("G:/Java/IO/dir/test");
        //创建目录mkdirs()
        boolean flag = dir.mkdirs();
        System.out.println(flag);

        //创建目录mkdir()
        dir = new File("G:/Java/IO/dir/test2");
         flag = dir.mkdirs();
        System.out.println(flag);

    }
}
