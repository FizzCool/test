package org.lf2020.m3.d01;

/**
 * @ClassName: ThreadDemo2Test
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/3/1 15:44
 */
public class ThreadDemo2Test {
    public static void main(String[] args) {
        ThreadDemo2 td2 = new ThreadDemo2();
        Thread t1 = new Thread(td2,"窗口1");
        Thread t2 = new Thread(td2,"窗口2");
        Thread t3 = new Thread(td2,"窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
