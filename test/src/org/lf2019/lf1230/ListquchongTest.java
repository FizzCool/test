package org.lf2019.lf1230;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName: ListquchongTest
 * @Description:
 * @Author: 梁飞
 * @Date: 2019/12/30
 */
public class ListquchongTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("hello");
        list.add("java");
        list.add("world");
        list.add("hello");
        list.add("java");
        list.add("world");
        list.add("hello");
        list.add("java");
        list.add("world");
        list.add("hello");
        list.add("java");
        list.add("world");
        list.add(1);

        List list1 = new ArrayList<String>();



        List listNew = new ArrayList();
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            String s = (String)iterator.next();
            if(!listNew.contains(s)){
                listNew.add(s);
            }
        }
        System.out.println(listNew);
    }
}
