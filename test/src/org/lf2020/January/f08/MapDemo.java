package org.lf2020.January.f08;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName: MapDemo
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/1/8
 */
public class MapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> l  = new LinkedHashMap<String,Integer>();
        l.put("a1",1);
        l.put("a2",2);
        l.put("a3",2);
        l.put("a4",2);
        l.put("a5",2);
        l.put("a6",2);
        l.put("a7",2);
        l.put("a8",3);

        System.out.println(l);
        Set<Map.Entry<String,Integer>> set = l.entrySet();
        for(Map.Entry<String,Integer> me : set){
            System.out.println(me.getKey()+"----"+me.getValue());
        }
        Set<String> set1 = l.keySet();
        for(String s :set1){
            System.out.println(s+"----"+l.get(s));
        }


    }

}
