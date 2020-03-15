package org.lf2020.m2.f19;

import java.io.*;

/**
 * @ClassName: Demo7
 * @Description: 序列化流Demo
 * @Author: 梁飞
 * @Date: 2020/2/19 22:48
 */
public class Demo7 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {


        Person person = new Person("皮卡丘",4);
        write(person);
        System.out.println(read());




    }
    public static Object read() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("1.txt"));
        Object o = ois.readObject();
        ois.close();
        return o;
    }
    public static void write(Object o) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("1.txt"));
        oos.writeObject(o);
        oos.close();
    }
}
