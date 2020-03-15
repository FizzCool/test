package org.lf2020.m1.f06;

import java.util.Set;
import java.util.TreeMap;

/**
 * @ClassName: TreeMapDemo
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/1/6
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Person,String> tm = new TreeMap<Person,String>();
        tm.put(new Person("海绵宝宝",10),"1");
        tm.put(new Person("派大星",9),"2");
        tm.put(new Person("章鱼哥",8),"3");
        tm.put(new Person("珊迪",7),"4");
        tm.put(new Person("蟹老板",10),"5");
        tm.put(new Person("海绵宝宝",10),"1");

        Set<Person> set = tm.keySet();
        for(Person p :set){
            System.out.println(p+"----"+tm.get(p));
        }
    }
}
