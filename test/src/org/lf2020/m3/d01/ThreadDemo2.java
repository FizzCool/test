package org.lf2020.m3.d01;

/**
 * @ClassName: ThreadDemo2
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/3/1 15:42
 */
public class ThreadDemo2 implements Runnable {
    private int count=100;
    private Object obj = new Object();
    @Override
    public void run() {
        Thread i = Thread.currentThread();
        while(true){
            synchronized(obj){
                if(count>0) {
                    count = count-1;
                    System.out.println(i.getName() + ":您正在购买第" + (100 - count) + "张票");
                    try {
                        i.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
