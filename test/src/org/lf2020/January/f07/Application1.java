package org.lf2020.January.f07;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 * @ClassName: Application1
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/1/7
 */
public class Application1 {
    public static void main(String[] args) {
        TreeMap<Character,Integer> treeMap = new TreeMap<Character,Integer>();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] cs = s.toCharArray();
        for(int i=0;i<cs.length;i++){
            char c= cs[i];
            if(!treeMap.containsKey(c)){
                treeMap.put(c,1);
            }
            else{
                treeMap.put(c,treeMap.get(c)+1);
            }
        }

        Set<Character> set = treeMap.keySet();
        for(Character c :set){
            StringBuilder sb = new StringBuilder();
            sb.append(c).append("(").append(treeMap.get(c)).append(")");
            System.out.println(sb);
        }
    }
}
