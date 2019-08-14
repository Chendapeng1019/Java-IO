package io;

import java.io.File;

/**
 * @ClassName ShowAllFile
 * @Description 采用递归的方式查看文件夹的所有子文件
 * @Author chendapeng
 * @Date 2019/5/19
 **/
public class ShowAllFile {
   static int size;
    public static void main(String[] args) {

        File dir = new File("G:/Java/IO");
        listFile(dir,"");
        System.out.println("一共有"+size+"个文件");
    }

    public static void listFile(File dir,String spance){
        File[] files = dir.listFiles(); //列出所有的子文件
        for(File file :files){
            if(file.isFile()){ //如果是文件，则输出文件名字
                System.out.println(spance+file.getName());
                size++;
            }else if(file.isDirectory()){ //如果是文件夹，则输出文件夹名字，并递归遍历改文件夹
                System.out.println(spance+file.getName());
                listFile(file,"|--");
            }
        }
    }
}
