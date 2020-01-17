package org.lf2019.lf1206;

import java.util.Scanner;

/**
 * @ClassName: MathTest
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2019/12/6
 */
public class MathTest {
    public static void main(String[] args) {
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("起始值：");
            int begin = sc.nextInt();
            System.out.println("结束值：");
            int end = sc.nextInt();
            int ran = 0;
            for(int i = 0;i<10000000;i++) {
                ran = getRandomOfRange(begin, end);
                if (ran == 300) {
                    System.out.println(ran);
                }
            }
        }
    }
    public static int getRandomOfRange(int begin,int end){
        int i = (int)(Math.random()*(end-begin+1)+begin);
        return i;
    }
}
