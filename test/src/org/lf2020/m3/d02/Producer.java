package org.lf2020.m3.d02;

/**
 * @ClassName: Producer
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/3/2 13:23
 */
public class Producer implements Runnable{
    private Student s;
    private int n = 0;

    public Producer(Student s) {
        this.s = s;
    }

    @Override
    public void run() {
        while(true){
            synchronized(s){

                if(n%2==0){
                    s.set("梁飞",23);
                }
                else{
                    s.set("张子愚",22);
                }
                n++;
            }
        }
    }
}
