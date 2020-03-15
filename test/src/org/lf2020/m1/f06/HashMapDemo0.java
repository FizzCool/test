package org.lf2020.m1.f06;

import java.util.HashMap;
import java.util.Set;

/**
 * @ClassName: HashMapDemo0
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/1/6
 */
public class HashMapDemo0 {
    public static void main(String[] args) {
        HashMap<Person,String> hm = new HashMap<Person,String>();
        hm.put(new Person("海绵宝宝",6),"1");
        hm.put(new Person("派大星",7),"2");
        hm.put(new Person("章鱼哥",8),"3");
        hm.put(new Person("珊迪",8),"4");
        hm.put(new Person("蟹老板",10),"5");
        hm.put(new Person("海绵宝宝",6),"1");

        Set<Person> set = hm.keySet();
        for(Person p:set){
            System.out.println(p+"------"+hm.get(p));
        }


    }
}
