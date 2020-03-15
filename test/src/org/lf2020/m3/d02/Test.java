package org.lf2020.m3.d02;

/**
 * @ClassName: Test
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/3/2 13:54
 */
public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        Consumer consumer = new Consumer(student);
        Producer producer = new Producer(student);
        Thread t1 = new Thread(producer,"生产者");
        Thread t2 = new Thread(consumer,"消费者");
        t1.start();
        t2.start();


    }
}
