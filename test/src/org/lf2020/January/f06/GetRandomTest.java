package org.lf2020.January.f06;

import java.util.HashSet;
import java.util.Random;

/**
 * @ClassName: GetRandomTest
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/1/6
 */
public class GetRandomTest {
    public static void main(String[] args) {
        Random r = new Random(20);
        int count =0;
        HashSet<Integer> h = new HashSet<Integer>();
        while(h.size()<20){
            count++;
            int i = r.nextInt(20)+1;
            h.add(i);
        }
        System.out.println(h);
        System.out.println(count);
    }
}
