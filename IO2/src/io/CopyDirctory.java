package io;

import java.io.*;

/**
 * @ClassName CopyDirctory
 * @Description
 * @Author chendapeng
 * @Date 2019/5/21
 **/
public class CopyDirctory {
    public static void main(String[] args) {
        File oldFile = new File("G:/Java/IO2");
        File newFile = new File("G:/new");
        list(oldFile,newFile);
    }

    public static void list(File oldFile,File newFile){

        if(oldFile.isDirectory()){
            ////在newFile创建名为oldFile.getName()的文件夹
            File file = new File(newFile,oldFile.getName());
            file.mkdirs();//创建文件夹

            File[] fileArr = oldFile.listFiles();
            for(File f: fileArr){
                list(f,file);
            }
        }else{ // 是文件，直接拷贝
            File file = new File(newFile,oldFile.getName());
            copy(oldFile,file);
        }
    }

    private static void copy(File oldFile, File newFile) {
        try {
            FileInputStream in = new FileInputStream(oldFile);
            FileOutputStream out = new FileOutputStream(newFile);
            byte[] flush = new byte[1024];
            in.read(flush);
            out.write(flush);
            out.close();
            in.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
