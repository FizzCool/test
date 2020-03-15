package org.lf2020.m3.d02;

/**
 * @ClassName: Consumer
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/3/2 13:46
 */
public class Consumer implements Runnable{
    private Student s;

    public Consumer() {
    }

    public Consumer(Student s) {

        this.s = s;
    }

    @Override
    public void run() {
        while(true) {
            s.get();
        }
    }
}
