package io;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @ClassName RandTest01
 * @Description 随机读取和写入 RandomAccessFile
 * @Author chendapeng
 * @Date 2019/6/9
 **/
public class RandTest02 {
    public static void main(String[] args) throws IOException {
        //分多少块
        File src = new File("G:\\Java\\IO3\\src\\io\\CopyTxt.java");
        //总长度
        long len =src.length();
        //每块大小
        int blockSize = 1024;
        //多少块
        int size = (int) Math.ceil(len*1.0/blockSize);
        System.out.println(size);
        //起始位置和实际大小
        int beginPos = 0;
        int actualSize = (int)(blockSize > len?len:blockSize);

        for(int i =0;i<size;i++){
            beginPos = i*blockSize;
            if(i == size -1){//最后一块
                actualSize = (int) len;
            }
            else{
                actualSize = blockSize;
                len -=actualSize; //剩余量
            }

            System.out.println(i+"-->"+beginPos+"-->"+actualSize);
            split(i,beginPos,actualSize);
        }
    }

    /**
     * 指定第i块、起始位置、实际长度
     * @param i
     * @param beginPos
     * @param actualSize
     * @throws IOException
     */
    //分块思想：起始位置，读取大小
    public static void split(int i ,int beginPos,int actualSize) throws IOException {
        RandomAccessFile raf = new RandomAccessFile(new File("G:\\Java\\IO3\\src\\io\\CopyTxt.java"), "r");
        RandomAccessFile raf2 = new RandomAccessFile(new File("G:/Java/IO3/src/dest/"+i+"Copy.java"), "rw");
        //随机读取
        raf.seek(beginPos);
        //读取
        byte[] flush = new byte[1024];//缓冲容器
        int len = -1;
        while((len = raf.read(flush))!=-1) {
            if (actualSize > len) {//获取本次读取的所有内容
                raf2.write(flush, 0, len);
                actualSize -= len;
            } else {
                raf2.write(flush, 0, actualSize);
                break;
            }
        }
        raf2.close();
        raf.close();
    }

}
