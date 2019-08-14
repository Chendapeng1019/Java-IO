package io;

import java.io.*;

/**
 * @ClassName CopyFile
 * @Description 文件拷贝：文件字节输入、输出流
 * @Author chendapeng
 * @Date 2019/5/21
 **/
public class CopyTxt {
    public static void main(String[] args) {
        long t1 = System.currentTimeMillis();
        copy("abc.txt", "abc-copy.txt");
        long t2 = System.currentTimeMillis();
        System.out.println(t2 - t1);
    }


    //仅限于纯文本
    public static void copy(String srcPath, String destPath) {
        //创建源文件
        File inputFile = new File(srcPath); // 源头
        File outFile = new File(destPath);  //目的地
        //选择流
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader(inputFile));
            bw = new BufferedWriter(new FileWriter(outFile));

            //3.操作（逐行读取）
            String line = null;

            while ((line = br.readLine()) != null) {
                bw.write(line); //逐行写出
                bw.newLine();
            }
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
