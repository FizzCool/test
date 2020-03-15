package org.lf2020.m1.f06;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @ClassName: TreeSetReviewTest
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/1/6
 */
public class TreeSetReviewTest {
    public static void main(String[] args) {
        TreeSet<Person> tree = new TreeSet<Person>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int num0 = o1.getAge()-o2.getAge();
                int num1 = num0==0?o1.getName().compareTo(o2.getName()):num0;
                return num1;
            }
        });
        tree.add(new Person("张子愚",21));
        tree.add(new Person("梁飞",22));
        tree.add(new Person("张子愚",22));
        tree.add(new Person("梁飞",21));
        tree.add(new Person("张婷婷",21));
        tree.add(new Person("张婷婷",22));
        tree.add(new Person("张子愚",21));
        tree.add(new Person("张子愚",21));

        for(Person p:tree){
            System.out.println(p);
        }
        System.out.println(tree);
    }
}
