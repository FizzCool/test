package org.lf2020.m3.d01;

/**
 * @ClassName: MyRunnable
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/3/1 14:29
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
       for(int i=0;i<1000;i++){
           System.out.println(Thread.currentThread().getName()+":"+i);
       }
    }
}
