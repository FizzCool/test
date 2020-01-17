package org.lf2020.January.f06;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName: MapDemo1
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/1/6
 */
public class MapDemo1 {
    public static void main(String[] args) {
        HashMap<String,String> hm = new HashMap<String,String>();
        hm.put("1","海绵宝宝");
        hm.put("2","派大星");
        hm.put("3","谢老板");
        hm.put("4","章鱼哥");
        hm.put("5","珊迪");

        Set<Map.Entry<String,String>> me = hm.entrySet();
        for(Map.Entry<String,String> e :me){
            System.out.println(e.getKey()+"----"+e.getValue());
        }
    }
}
