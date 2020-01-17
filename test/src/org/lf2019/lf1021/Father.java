package org.lf2019.lf1021;

public class Father {
    public String name;
    public int age;


    public Father(){
        System.out.println("父类的构造方法");
        System.out.println("姓名:"+name+"\t"+"年龄"+age);
    }
    public void show(){
        System.out.println("父类方法");
    }
    {
        System.out.println("构造代码块");
    }
    static {
        System.out.println("静态代码块");
    }
}
