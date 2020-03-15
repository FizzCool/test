package org.lf2020.m2.f20;

import java.util.Properties;
import java.util.Set;

/**
 * @ClassName: ProertiesDemo
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/2/20 10:37
 */
public class ProertiesDemo {
    public static void main(String[] args) {
        Properties prop = new Properties();
        prop.put("1号","小明");
        prop.put("2号","小花");
        prop.put("3号","小乐言");

        Set<Object> set= prop.keySet();
        for(Object o : set){
            Object value = prop.get(o);
            System.out.println(o+"--"+value);
        }
    }
}
