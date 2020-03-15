package org.lf2020.m2.f07;

/**
 * @ClassName: JieChengDemo
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/2/7 14:07
 */
public class JieChengDemo {
    public static void main(String[] args) {
        System.out.println(jieCheng(5));
    }
    public static int  jieCheng(int n){
        if(n==1){
            return 1;
        }
        else return n * jieCheng(--n);
    }
}
