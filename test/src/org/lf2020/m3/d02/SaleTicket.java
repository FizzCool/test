package org.lf2020.m3.d02;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName: SaleTicket
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/3/2 11:56
 */
public class SaleTicket implements Runnable{
    private int tickets=100;
    ReentrantLock lock = new ReentrantLock();

    Object obj = new Object();
    /*@Override
    public void run() {
        synchronized(obj){
            while(tickets>0){
                System.out.println(Thread.currentThread().getName()+":正在出售第"+tickets+"张票");
                --tickets;
            }
        }
    }*/

    @Override
    public void run() {
        try {
                lock.lock();
                while (tickets > 0) {
                    System.out.println(Thread.currentThread().getName() + ":正在出售第" + tickets + "张票");
                    --tickets;
                }
            }finally {
                lock.unlock();
        }

    }
}
