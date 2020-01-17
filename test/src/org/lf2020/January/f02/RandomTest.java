package org.lf2020.January.f02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @ClassName: RandomTest
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/1/2
 */
public class RandomTest {
    public static void main(String[] args) {
        Random r = new Random(20);
        int count = 0;
        List<Integer> list = new ArrayList<Integer>();
        while(count<10){
            Integer i = (60-r.nextInt(20)+1);
            if(!list.contains(i)) {
                list.add(i);
                count++;
            }
        }
        for(Integer integer : list){
            System.out.println(integer);
        }
    }
}
