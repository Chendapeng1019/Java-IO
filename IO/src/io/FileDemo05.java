package io;

import java.io.File;

/**
 * @ClassName FileDemo01
 * @Description 其他信息
 * length():文件的字节数
 * @Author chendapeng
 * @Date 2019/5/18
 **/
public class FileDemo05 {

    public static void main(String[] args) {

        File src = new File("G:/Java/IO/IMG_20140519_180900.jpg");
        System.out.println("长度:"+src.length());
    }
}
