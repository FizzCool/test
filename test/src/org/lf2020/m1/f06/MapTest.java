package org.lf2020.m1.f06;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName: MapTest
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/1/6
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        map.put("name","刘备");
        map.put("age","12");
        map.put("height","八尺");

        Set<String> set = map.keySet();
        for(String s : set){
            System.out.println(s+"=="+map.get(s));
        }
    }
}
