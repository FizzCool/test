package org.lf2019.lf1226;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName: ListTest
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2019/12/26
 */
public class ListTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("我");
        list.add("爱");
        list.add("Java");
        list.add(2,"学");
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            String s = (String)iterator.next();
            System.out.println(s);
        }
        System.out.println("--------------------------------------------------------------");
        List list1 = new ArrayList();
        list1.add("我爱学js");
        list.add(2,list1);
        Iterator i2 = list.iterator();
        while(i2.hasNext()){
            System.out.println(i2.next());
        }
        System.out.println(list.remove(1));
        for (int i = 0;i<list.size();i++){
            System.out.print(list.get(i));
        }
        System.out.println();
    }
}
