package org.lf2019.lf1021;

public class Son extends Father {
    public Son(){}
    public Son(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("子类构造方法，年龄为："+age);
    }



}
