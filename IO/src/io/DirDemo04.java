package io;

import java.io.File;

/**
 * @ClassName DirDemo01
 * @Description 递归
 * 统计文件夹的大小
 * @Author chendapeng
 * @Date 2019/5/19
 **/
public class DirDemo04 {
    static long size;

    public static void main(String[] args) {
        File src = new File("G:/Java/IO");
        countFile(src);
        System.out.println("文件的大小为"+size);
    }

    //统计文件夹的大小
    public static void countFile(File src) {
        //获取大小
        if (null != src && src.exists()) {
            if (src.isFile()) {
                size = size + src.length();
            } else { //子孙级
                for (File file : src.listFiles()) {
                    countFile(file);
                }
            }
        }
    }
}
