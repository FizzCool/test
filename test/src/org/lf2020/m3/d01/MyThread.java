package org.lf2020.m3.d01;

/**
 * @ClassName: MyThread
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/3/1 10:57
 */
public class MyThread  extends Thread{
    public MyThread(){
        super();
    }
    public MyThread(String name){
        super(name);
    }
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println(getName()+":"+i+"----优先级:"+getPriority());
            try {
                sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
