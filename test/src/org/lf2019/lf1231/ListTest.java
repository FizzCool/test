package org.lf2019.lf1231;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 * @ClassName: ListTest
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2019/12/31
 */
public class ListTest {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
//        List<String> list = new ArrayList<String>();
//        List<String> list = new LinkedList<String>();
        List<String> list = new Vector<String>();
        list.add("12");
        list.add("as");
        list.add("12");
        list.add("as");
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
        }
        System.out.println("----------------------------------------------------");
        for(int i =0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("----------------------------------------------------");
        System.out.println(list.contains("as"));
        System.out.println(list.contains("asd"));
        System.out.println(list.indexOf("as"));
        System.out.println(list.indexOf("asd"));
        System.out.println(list.set(1,"我爱你"));
        for(int i = 1;i<list.size();i++){
            System.out.println(list.get(i));
        }
        long end = System.currentTimeMillis();
        System.out.println("用时:"+((double)(end-start)/1000)+"s");
    }
}
