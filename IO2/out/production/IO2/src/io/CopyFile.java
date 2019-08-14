package io;

import java.io.*;

/**
 * @ClassName CopyFile
 * @Description 文件拷贝：文件字节输入、输出流
 * @Author chendapeng
 * @Date 2019/5/21
 **/
public class CopyFile {
    public static void main(String[] args) {
        long t1 = System.currentTimeMillis();
        copy("music.mp3","copymusic.mp3");
        long t2 = System.currentTimeMillis();
        System.out.println(t2-t1);
    }

    public static void copy(String srcPath, String destPath) {
        //创建源文件
        File inputFile = new File(srcPath); // 源头
        File outFile = new File(destPath);  //目的地
        //选择流
        InputStream is = null;
        OutputStream os = null;
        try {
            is =new BufferedInputStream(new FileInputStream(inputFile));
            os =new BufferedOutputStream(new FileOutputStream(outFile));

            //3.操作（分段读取）
            byte[] flush = new byte[1024]; //缓冲容器
            int len = -1; //接收长度
            while ((len = is.read(flush)) != -1) {
                os.write(flush, 0, len);
            }
            os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.释放资源 分别关闭， 先打开的后关闭
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
