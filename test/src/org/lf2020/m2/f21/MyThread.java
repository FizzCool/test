package org.lf2020.m2.f21;

/**
 * @ClassName: MyThread
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/2/21 12:43
 */
public class MyThread extends Thread{
    @Override
    public void run() {
       for(int i=0;i<200;i++){
           System.out.println(getName()+":"+i);
       }
    }
}
