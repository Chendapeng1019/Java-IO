package io;

import java.io.UnsupportedEncodingException;

/**
 * @ClassName ContentEncode
 * @Description  解码：字节--》字符串
 * @Author chendapeng
 * @Date 2019/5/19
 **/
public class ContentDecode {

    public static void main(String[] args) throws UnsupportedEncodingException {
        String msg="性命生命使命a";
        //编码：字节数组
        byte[] datas = msg.getBytes();  //默认使用工程的字符集
        System.out.println(datas.length);

        //解码：字符串
        msg = new String(datas,0,datas.length,"utf8");
        System.out.println(msg);

        //乱码：
         //1.字节数不够
        msg = new String(datas,0,datas.length-2,"utf8");
        System.out.println(msg);
        msg = new String(datas,0,datas.length-1,"utf8");
        System.out.println(msg);

        //2.字符集不统一
        msg = new String(datas,0,datas.length,"gbk");
        System.out.println(msg);
    }
}
