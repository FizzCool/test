package org.lf2019.lf1230;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @ClassName: ListTest
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2019/12/30
 */
public class ListTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("我张子愚");
        list.add("第一个不服");
        list.add("哈哈哈");

//        Iterator iterator = list.iterator();
//        while(iterator.hasNext()){
//            String s = (String)iterator.next();
//            if("我张子愚".equals(s)){
//                list.add("sb");
//            }
//        }
//        for(int i = 0;i<list.size();i++){
//            String s = (String)list.get(i);
//            if("我张子愚".equals(s)){
//                list.add(i,"sb");
//            }
//        }

        ListIterator listIterator = list.listIterator();
        while(listIterator.hasNext()){
            String s = (String)listIterator.next();
            if("我张子愚".equals(s)){
               listIterator.add("" +
                       "" +
                       "");
            }
        }


        System.out.println(list);

    }
}
