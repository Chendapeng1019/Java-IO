package io;

import java.io.File;
import java.io.IOException;

/**
 * @ClassName FileDemo01
 * @Description 其他信息
 * createNewFile()：不存在才创建，存在创建成功
 * delete() ：删除已存在的文件
 * @Author chendapeng
 * @Date 2019/5/18
 **/
public class FileDemo06 {

    public static void main(String[] args) throws IOException {

        File src = new File("G:/Java/IO/io.txt");
        boolean flag = src.createNewFile();
        System.out.println("长度:" + flag);

        //删除文件
        flag = src.delete();
        System.out.println(flag);
    }
}
