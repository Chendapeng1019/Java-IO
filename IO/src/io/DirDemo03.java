package io;

import java.io.File;

/**
 * @ClassName DirDemo01
 * @Description 递归
 * 打印子孙目录和文件名称
 * @Author chendapeng
 * @Date 2019/5/19
 **/
public class DirDemo03 {
    public static void main(String[] args) {
        File  src = new File("G:/Java/IO");
        printName(src,0);
    }


    //打印子孙级目录和文件的名称
    public static void printName(File src,int deep){
        for(int i=0;i<deep;i++){
            System.out.print("-");
        }
        System.out.println(src.getName());
        if(null == src ||! src.exists()){
            return ;
        }else if(src.isDirectory()){  //目录
            for(File s:src.listFiles()){
                printName(s,deep+1);
            }
        }
    }
}
