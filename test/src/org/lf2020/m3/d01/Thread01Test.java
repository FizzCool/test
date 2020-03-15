package org.lf2020.m3.d01;

/**
 * @ClassName: Thread01Test
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/3/1 12:01
 */
public class Thread01Test {
    public static void main(String[] args) {
        Thread01 t1 = new Thread01();
        t1.start();
        try {
            Thread.sleep(3000);
            t1.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
