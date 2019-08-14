package io;

import java.io.*;

/**
 * @ClassName IOTest05
 * @Description
 * 文件字符输入流
 * 1.创建源
 * 2.选择流
 * 3.操作（写出内容）
 * 4.释放资源
 * @Author chendapeng
 * @Date 2019/5/28
 **/
public class IOTest05 {

    public static void main(String[] args) {
        //1.创建源
        File src = new File("abc.txt");
        //2.选择流
        Reader reader =null;
        try {
            reader = new FileReader(src);
            //操作
            char[] flush = new char[1024]; //缓冲容器
            int len = -1;//接收长度
            while((len=reader.read(flush))!=-1){
                //字符数组--> 字符串(解码)
                String str= new String(flush,0,len);
                System.out.println(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //4.释放资源
            try {
                if(null!=reader){
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
