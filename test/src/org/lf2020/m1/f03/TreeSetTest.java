package org.lf2020.m1.f03;

import java.util.TreeSet;

/**
 * @ClassName: TreeSetTest
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/1/3
 */
public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<Person> t = new TreeSet<Person>();
        t.add(new Person("杰洛特",40));
        t.add(new Person("杰洛",40));
        t.add(new Person("叶奈法",20));
        t.add(new Person("皮卡丘",6));
        t.add(new Person("杰尼龟",7));
        t.add(new Person("艾伦",18));
        t.add(new Person("三笠",16));
        t.add(new Person("叶奈法",20));
        t.add(new Person("皮卡丘",6));
        t.add(new Person("杰尼龟",7));

        for(Person p :t){
            System.out.println(p);
        }

    }
}
