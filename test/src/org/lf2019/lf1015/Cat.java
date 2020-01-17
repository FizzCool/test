package org.lf2019.lf1015;

public class Cat {
    public String c_type = "Bool";
    public static int c_age = 0;
    public final int c_address = 1;
    public void mute(){
        System.out.println("喵喵喵");
    }
    public static void play(){
        System.out.println("正在玩耍");
    }
    public final void stop(){
        System.out.println("停止玩耍");
    }
}
