package org.lf2020.m3.d01;

/**
 * @ClassName: MyRunnableTest
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/3/1 14:31
 */
public class MyRunnableTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable(),"关羽");
        Thread t2 = new Thread(new MyRunnable(),"张飞");
        t1.start();
        t2.start();
    }
}
