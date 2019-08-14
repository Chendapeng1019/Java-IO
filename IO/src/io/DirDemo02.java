package io;

import java.io.File;

/**
 * @ClassName DirDemo01
 * @Description
 * 列出下一级
 * 1. list() :列出下级名称
 * 2. listFile() :列出下级File对象
 *
 * 列出所有的盘符：listRoots
 * @Author chendapeng
 * @Date 2019/5/19
 **/
public class DirDemo02 {
    public static void main(String[] args) {
        File  dir = new File("G:/Java/IO");

      //列出下级名称
        String[] subNames = dir.list(); //只返回一层
        for(String s: subNames){
            System.out.println(s);
        }

        //下级对象
        File[] subFile = dir.listFiles();
        for(File f: subFile){
            System.out.println(f.getAbsolutePath());
        }

        //所有盘符
        File[] roots = dir.listRoots();
        for(File r:roots){
            System.out.println(r.getAbsolutePath());
        }
    }
}
