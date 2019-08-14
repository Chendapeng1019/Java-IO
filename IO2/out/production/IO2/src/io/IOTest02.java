package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName IOTest01
 * @Description
 * 第一个程序：理解操作步骤 标准
 * 1.创建源
 * 2.选择流
 * 3.操作
 * 4.释放资源
 * @Author chendapeng
 * @Date 2019/5/21
 **/
public class IOTest02 {

    public static void main(String[] args)  {
        //1.创建源
        File src = new File("abc.txt");
        //2.选择流
        InputStream is = null;
        try {
             is = new FileInputStream(src);
            //3.操作（读取）
            int temp ;
           while ((temp=is.read())!=-1){
               System.out.println((char) temp);
           }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
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
