package org.lf2020.m3.d01;

import java.util.Date;

/**
 * @ClassName: Thread01
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/3/1 12:00
 */
public class Thread01 extends Thread {
    @Override
    public void run() {
        System.out.println(new Date());
        try {
            sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(new Date());
    }
}
