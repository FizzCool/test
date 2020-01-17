package org.lf2019.lf1225;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @ClassName: CollectionTest
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2019/12/25
 */
public class CollectionTest {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("张");
        c.add("子");
        c.add("愚");
        Object[] o =c.toArray();
        for(int i=0;i<o.length;i++){
            String s = (String)o[i];
            System.out.println(s);
        }

        Iterator iterator = c.iterator();
        while(iterator.hasNext()){
            String s = (String)iterator.next();
            System.out.println(s);
        }
    }

}
