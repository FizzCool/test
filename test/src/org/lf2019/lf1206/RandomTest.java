package org.lf2019.lf1206;

import java.util.Random;

/**
 * @ClassName: RandomTest
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2019/12/6
 */
public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random();
        for(int i = 0;i<100;i++){
            System.out.println(random.nextInt(100));
        }
        System.out.println("--------------------------------------------");
        for(int i = 0;i<100;i++){
            System.out.println(random.nextInt(100));
        }
    }
}
