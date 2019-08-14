package io;

import java.io.*;

/**
 * @ClassName IOTest05
 * @Description
 * 字节数组输出流  ByteArrayOutputStream
 * 1.创建源 ；内部维护
 * 2.选择流 :不关联源
 * 3.操作（写出内容）
 * 4.释放资源：可以不用
 *
 * 获取数据 ；
 * @Author chendapeng
 * @Date 2019/5/28
 **/
public class IOTest08 {

    public static void main(String[] args) {
        //1.创建源
        byte[] dest = null;
        //2.选择流
        ByteArrayOutputStream baos =null;
        try {
            baos = new ByteArrayOutputStream();
            //操作（写出）
            //写法一
           String msg = "show me the code";
           byte[] datas = msg.getBytes(); // 字符串-->字符数组
            baos.write(datas,0,datas.length);
            baos.flush();

            //获取数据
            dest = baos.toByteArray();
            System.out.println(dest.length+"-->"+(new String(dest,0,baos.size())));
        } catch (IOException e1) {
            e1.printStackTrace();
        }finally {
            //4.释放资源
            try {
                if(null!=baos){
                    baos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
