package io;

import java.io.*;

/**
 * @ClassName PrintTest01
 * @Description
 * 打印流 PrintWrite
 *
 * @Author chendapeng
 * @Date 2019/6/9
 **/
public class PrintTest02 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw  =new PrintWriter(new BufferedOutputStream(new FileOutputStream("print.txt")),true);
        pw.println("打印流");
        pw.println(true);

        pw.close();


    }
}
