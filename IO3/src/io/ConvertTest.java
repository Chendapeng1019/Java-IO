package io;

import java.io.*;

/**
 * @ClassName ConvertTest
 * @Description
 * 转换流：InputStreamReader OutputStreamWriter
 * 1.以字符流的形式操作字节流（纯文本）
 * 2.指定字符集
 * @Author chendapeng
 * @Date 2019/6/2
 **/
public class ConvertTest {
    public static void main(String[] args) {
        //操作System.in 和System.out
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String msg ="";
        while(!msg.equals("exit")){
            try {
                msg = br.readLine(); //循环读取
                bw.write(msg);   //循环写出
                bw.newLine();
                bw.flush(); // 强制刷新
            } catch (IOException e) {
                System.out.println("操作异常");
            }finally {
                //4.释放资源 分别关闭， 先打开的后关闭
                if (bw != null) {
                    try {
                        bw.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

                if (br != null) {
                    try {
                        br.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

        }


    }
}
