package io;

import java.io.*;

/**
 * @ClassName IOTest05
 * @Description
 * 文件字符输出流
 * 1.创建源
 * 2.选择流
 * 3.操作（写出内容）
 * 4.释放资源
 * @Author chendapeng
 * @Date 2019/5/28
 **/
public class IOTest06 {

    public static void main(String[] args) {
        //1.创建源
        File dest = new File("dest.txt");
        //2.选择流
        Writer writer =null;
        try {
            writer = new FileWriter(dest);
            //操作（写出）
            //写法一
//           String msg = "IO is so easy\r\n 尚学堂欢迎您";
//           char[] datas = msg.toCharArray(); // 字符串-->字符数组
//            writer.write(datas,0,datas.length);
//            writer.flush();

            //写法二
//            String msg = "IO is so easy\r\n 尚学堂欢迎您";
////            writer.write(msg);
////            writer.flush();

            //写法三
            writer.append("IO is so easy\r\n").append("尚学堂欢迎您");
            writer.flush();

        } catch (IOException e1) {
            e1.printStackTrace();
        }finally {
            //4.释放资源
            try {
                if(null!=writer){
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
