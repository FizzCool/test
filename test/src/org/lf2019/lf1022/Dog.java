package org.lf2019.lf1022;

public class Dog extends Animal{
    int age = 5;
    @Override
    public void eat() {
        System.out.println( "狗正在吃饭" );
    }


    public void sleep() {
        System.out.println( "狗正在睡觉" );
    }

    @Override
    public void dance(){
        System.out.println("狗狗在跳舞");
    }
}
