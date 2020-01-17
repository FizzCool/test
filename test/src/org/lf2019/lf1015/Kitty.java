package org.lf2019.lf1015;

public class Kitty extends Cat{

    @Override
    public void mute() {
        System.out.println("我是重写的mute");
    }

    public static void play(){
        System.out.println("我是子类的play");
    }


}
