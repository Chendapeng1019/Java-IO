package io;

import java.io.*;

/**
 * @ClassName
 * @Description 文件字符输入流 加入缓冲流
 * 1.创建源
 * 2.选择流
 * 3.操作（写出内容）
 * 4.释放资源
 * @Author chendapeng
 * @Date 2019/5/28
 **/
public class BufferedTest03 {

    public static void main(String[] args) {
        //1.创建源
        File src = new File("abc.txt");
        //2.选择流
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(src));
            //操作
            String line = null;
            while ((line = ((BufferedReader) reader).readLine()) != null) {
                //字符数组--> 字符串(解码)

                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //4.释放资源
            try {
                if (null != reader) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
