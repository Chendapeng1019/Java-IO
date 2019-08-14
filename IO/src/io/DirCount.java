package io;

import java.io.File;

/**
 * @ClassName DirDemo01
 * @Description 递归
 * 使用面向对象：统计文件夹的大小
 * @Author chendapeng
 * @Date 2019/5/19
 **/
public class DirCount {
    //大小
    private  long len;
    //文件夹
    private String path;
    //文科的个数
    private int fileSize;
    //文件夹的个数
    private int dirSize; // 包含自身，若想不包含自身初始值为-1

    //源
    private File src;

    public DirCount(String path) {
        this.path = path;
        this.src = new File(path);
        countFile(this.src);
    }

    public static void main(String[] args) {
        DirCount dir = new DirCount("G:/Java/IO");
        System.out.println("文件大小为："+dir.getLen());
        System.out.println("文件的个数："+dir.getFileSize());
        System.out.println("文件夹的个数："+dir.getDirSize());
    }


    //统计文件夹的大小
    private  void countFile(File src) {
        //获取大小
        if (null != src && src.exists()) {
            if (src.isFile()) {
                len = len + src.length();
                this.fileSize ++;
            } else { //子孙级
                this.dirSize++;
                for (File file : src.listFiles()) {
                    countFile(file);
                }
            }
        }
    }

    public long getLen() {
        return len;
    }

    public int getFileSize() {
        return fileSize;
    }

    public int getDirSize() {
        return dirSize;
    }
}
