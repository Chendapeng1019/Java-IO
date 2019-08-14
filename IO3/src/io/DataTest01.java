package io;

import java.io.*;

/**
 * @ClassName DataTest01
 * @Description
 * 数据流
 * 1.先写出后读取
 * 2.读取的顺序与写出保存一致
 *
 * DataOutputStream
 * DataInputStream
 * @Author chendapeng
 * @Date 2019/6/2
 **/
public class DataTest01 {
    public static void main(String[] args) throws IOException {
        //写出
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(baos));
        //操作数据类型 + 数据
        dos.writeUTF("编码辛酸泪");
        dos.writeInt(18);
        dos.writeBoolean(false);
        dos.writeChar('a');
        dos.flush();
        byte[] datas = baos.toByteArray();
        System.out.println(datas.length);
        //读取
        DataInputStream dis = new DataInputStream(new BufferedInputStream(new ByteArrayInputStream(datas)));
        //顺序与写出一致
        String msg = dis.readUTF();
        int age = dis.readInt();
        boolean flag = dis.readBoolean();
        char ch = dis.readChar();
        System.out.println(age);
    }
}
