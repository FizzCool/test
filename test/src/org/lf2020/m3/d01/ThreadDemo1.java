package org.lf2020.m3.d01;

/**
 * @ClassName: ThreadDemo1
 * @Description: 模拟电影院售票,三个窗口抢票
 * @Author: 梁飞
 * @Date: 2020/3/1 14:52
 */
public class ThreadDemo1 extends Thread{
    private static int count = 100;

    public ThreadDemo1() {
    }

    public ThreadDemo1(String name) {
        super(name);
    }

    @Override
    public void run() {
        while(true){
            if(count>0) {
                count--;
                System.out.println(getName() + ":您正在购买第" + (100 - count) + "张票");
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
