package org.lf2020.m1.f10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName: SortDemo
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/1/10
 */
public class SortDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(50);
        list.add(40);
        list.add(30);
        list.add(80);
        list.add(70);
        list.add(60);

        Collections.sort(list);
        System.out.println(list);
        System.out.println(Collections.binarySearch(list,300));

    }
}
