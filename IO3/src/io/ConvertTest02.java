package io;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @ClassName ConvertTest
 * @Description 转换流：InputStreamReader OutputStreamWriter
 * 1.以字符流的形式操作字节流（纯文本）
 * 2.指定字符集
 * @Author chendapeng
 * @Date 2019/6/2
 **/
public class ConvertTest02 {
    public static void main(String[] args) throws IOException {
        //操作网络流 下载百度的源代码

        BufferedReader reader = null;
        BufferedWriter writer = null;
        try {
            reader =new BufferedReader(new InputStreamReader(new URL("http://www.baidu.com").openStream(),"UTF-8"));
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("baidu.html"),"UTF-8"));
            String msg;
            while ((msg=reader.readLine())!=null) {
                writer.write(msg); //字符集不统一出现乱码
                writer.newLine();
            }
            writer.flush();
        } catch (IOException e) {
            System.out.println("操作异常");
        } finally {
            //4.释放资源 分别关闭， 先打开的后关闭
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


