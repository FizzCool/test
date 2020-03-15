package org.lf2020.m1.f02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName: sortTest
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/1/2
 */
public class sortTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        while(true) {
            System.out.println("请输入一个整数,输入0退出");
            Integer i = new Integer(sc.nextInt());
            if(i==0){
                break;
            }
            list.add(i);
        }
        System.out.println(list);
        Integer[] is = list.toArray(new Integer[list.size()]);
        Arrays.sort(is);
        System.out.println(Arrays.toString(is));
        System.out.println(is[is.length-1]);
    }
}
