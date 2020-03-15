package org.lf2020.m3.d01;

/**
 * @ClassName: MyThreadTest
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/3/1 10:59
 */
public class MyThreadTest {
    public static void main(String[] args) throws InterruptedException {
        MyThread m1=new MyThread("张子愚");
        MyThread m2 = new MyThread("刘波");
        MyThread m3 = new MyThread("顾天语");
        m3.setPriority(10);
        m2.setPriority(1);
        m1.setDaemon(true);
        m2.setDaemon(true);
        m3.setDaemon(true);
        m1.start();
        m2.start();
        m3.start();
        Thread.currentThread().setName("梁飞");
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
            Thread.currentThread().sleep(1);
        }
    }
}
