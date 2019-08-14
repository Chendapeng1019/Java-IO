package io;

import java.io.File;

/**
 * @ClassName PathDemo01
 * @Description
 * @Author chendapeng
 * @Date 2019/5/18
 **/
public class PathDemo01 {
    /**
     * \ /名称分隔符 separator
     * @param args
     */
    public static void main(String[] args) {
        String path ="G:\\Java\\IO\\IMG_20140519_180900.jpg";

        System.out.println(File.separatorChar);

        //建议
        //1. /
        path= "G:/Java/IO/IMG_20140519_180900.jpg";
        //2.常量拼接
       path = "G:"+File.separatorChar+"Java"+File.separatorChar+"IO"+File.separatorChar+"IMG_20140519_180900.jpg";
        System.out.println(path);

    }
}
