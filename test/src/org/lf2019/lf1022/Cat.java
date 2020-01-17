package org.lf2019.lf1022;

public class Cat extends Animal {
    public Cat(){
        name =2;
    }
    int age = 4;
    @Override
    public void eat(){
        System.out.println("猫正在吃饭");
    }


    public void sleep(){
        System.out.println("猫正在睡觉");
    }
    @Override
    public void dance(){
        System.out.println("猫猫在跳舞");
    }
}
