package org.lf2019.lf1221;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @ClassName: CollectionTest
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2019/12/22
 */
public class CollectionTest {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        Collection c2 = new ArrayList();
        c1.add("abc1");
        c1.add("abc2");
        c1.add("abc3");
        c1.add("abc4");
        c1.add(new Integer(1));



        c2.add("abc5");
        c2.add("abc6");
        c2.add("abc7");

        System.out.println(c1.remove(c1));
        System.out.println(c1);
    }
}
