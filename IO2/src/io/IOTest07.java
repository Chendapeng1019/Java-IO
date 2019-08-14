package io;

import java.io.*;

/**
 * @ClassName IOTest05
 * @Description
 * 字节数组输入流
 * 1.创建源 :字节数组 不要太大
 * 2.选择流
 * 3.操作（写出内容）
 * 4.释放资源  ：可以不用处理
 * @Author chendapeng
 * @Date 2019/5/28
 **/
public class IOTest07 {

    public static void main(String[] args) {
        //1.创建源
        byte[] src = "talk is cheap show me the code".getBytes();
        //2.选择流
        InputStream is =null;
        try {
            is = new ByteArrayInputStream(src);
            //操作
            byte[] flush = new byte[5]; //缓冲容器
            int len = -1;//接收长度
            while((len=is.read(flush))!=-1){
                //字符数组--> 字符串(解码)
                String str= new String(flush,0,len);
                System.out.println(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //4.释放资源
            try {
                if(null!=is){
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
