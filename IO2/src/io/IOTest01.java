package io;

import java.io.*;

/**
 * @ClassName IOTest01
 * @Description
 * 第一个程序：理解操作步骤
 * 1.创建源
 * 2.选择流
 * 3.操作
 * 4.释放资源
 * @Author chendapeng
 * @Date 2019/5/21
 **/
public class IOTest01 {

    public static void main(String[] args) {
        //1.创建源
        File src = new File("abc.txt");
        //2.选择流
        try {
            InputStream is = new FileInputStream(src);
            //3.操作（读取）
            int data1 = is.read();//第一个数据
            int data2 = is.read(); //第二个数据
            int data3 = is.read(); //第三个数据

            System.out.println((char)data1);
            System.out.println((char)data2);
            System.out.println((char)data3);
            //4.释放资源
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
