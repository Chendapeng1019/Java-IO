package io;

import java.io.*;
import java.util.Date;

/**
 * @ClassName DataTest01
 * @Description
 * 对象流
 * 1.先写出后读取
 * 2.读取的顺序与写出保存一致
 *3.不是所有的对象都可以序列化，必须实现Serializable
 * ObjectOutputStream
 * ObjectInputStream
 * @Author chendapeng
 * @Date 2019/6/2
 **/
public class ObjectTest01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //写出-->序列化
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(baos));
        //操作数据类型 + 数据
        oos.writeUTF("编码辛酸泪");
        oos.writeInt(18);
        oos.writeBoolean(false);
        oos.writeChar('a');

        //对象
        oos.writeObject("谁解其中味");
        oos.writeObject(new Date());
        Employee emp = new Employee("马云",400);
        oos.writeObject(emp);
        oos.flush();
        byte[] datas = baos.toByteArray();
        System.out.println(datas.length);
        //读取 -->反序列化
        ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new ByteArrayInputStream(datas)));
        //顺序与写出一致
        String msg = ois.readUTF();
        int age = ois.readInt();
        boolean flag = ois.readBoolean();
        char ch = ois.readChar();
        System.out.println(age);
        //对象的数据还原
        Object str = ois.readObject();
        Object date = ois.readObject();
        Object employee = ois.readObject();

        if(str instanceof String){
            String strObj = (String) str;
            System.out.println(strObj);
        }

        if(date instanceof Date){
            Date dateObj = (Date) date;
            System.out.println(dateObj);
        }

        if(employee instanceof Employee){
            Employee empObject = (Employee) employee;
            System.out.println(empObject.getName()+"-->"+empObject.getSalary());
        }
    }
}

class Employee implements Serializable{
    private String name;
    private transient double salary;  //该数据不需要序列化

    public Employee() {
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
