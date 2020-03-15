package org.lf2020.m3.d01;

/**
 * @ClassName: ThreadDemo1Test
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/3/1 14:59
 */
public class ThreadDemo1Test {
    public static void main(String[] args) {
        ThreadDemo1 t1 = new ThreadDemo1("窗口1");
        ThreadDemo1 t2 = new ThreadDemo1("窗口2");
        ThreadDemo1 t3 = new ThreadDemo1("窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}
