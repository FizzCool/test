package org.lf2020.m2.f07;

/**
 * @ClassName: TestDemo
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/2/7 14:23
 */
public class TestDemo {
    public static void main(String[] args) {
        System.out.println(jc(20));
    }
    public static int jc(int n){
        if(n==1||n==2){
            return 1;
        }
        else{
            return (jc(n-2)+jc(n-1));
        }
    }
}
