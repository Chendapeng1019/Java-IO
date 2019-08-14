package io;

import java.io.*;

/**
 * @ClassName IOTest002
 * @Description
 * @Author chendapeng
 * @Date 2019/5/21
 **/
public class IOTest002 {
    public static void main(String[] args) {
        //创建源
        File file = new File("abc.txt");

        //2.选择流
        InputStream is = null;
        try {
             is = new FileInputStream(file);
            int temp;
             while((temp = is.read())!=-1){
                 //操作
                 System.out.println((char) temp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                //4.释放资源
                if(null!=is){
                    is.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
