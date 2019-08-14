package io;

import java.io.*;

/**
 * @ClassName IOTest01
 * @Description
 * 四个步骤：分段读取 文件字节输出流
 * 1.创建源
 * 2.选择流
 * 3.操作（写出内容）
 * 4.释放资源
 * @Author chendapeng
 * @Date 2019/5/21
 **/
public class IOTest04 {

    public static void main(String[] args)  {
        //1.创建源
        File src = new File("dest.txt");
        //2.选择流
        OutputStream os= null;
        try {
             os = new FileOutputStream(src,true);
            //3.操作（写出）
            String msg = "IO is so easy\r\n";
            byte[] datas = msg.getBytes();//字符串--》字节数组（编码）
            os.write(datas,0,datas.length);
            os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //4.释放资源
          if(null!=os){
              try {
                  os.close();
              } catch (IOException e) {
                  e.printStackTrace();
              }
          }
        }
    }


}
