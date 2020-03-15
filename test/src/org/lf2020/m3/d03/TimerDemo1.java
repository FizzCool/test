package org.lf2020.m3.d03;

import java.util.Timer;


/**
 * @ClassName: TimerDemo1
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/3/3 14:57
 */
public class TimerDemo1 {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Timer t = new Timer();
        t.schedule(task,3000);
    }
}
