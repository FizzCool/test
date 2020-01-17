package org.lf2019.lf1022;

public class Zi extends Fu{
    int num = 100;
    int num2 = 1000;

    @Override
    public void show() {
        System.out.println("这是子类的方法");
    }
    public static void method(){
        System.out.println("这是子类的静态方法");
    }

}
