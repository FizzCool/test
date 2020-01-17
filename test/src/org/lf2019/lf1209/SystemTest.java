package org.lf2019.lf1209;

/**
 * @ClassName: SystemTest
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2019/12/9
 */
public class SystemTest {
    public static void main(String[] args) {
        Person p1 = new Person("梁飞",22);
        Person p2 = new Person("小张",20);
        Person p3 = new Person("小李",21);


        p1=null;
        p2=null;
        System.gc();
        System.exit(578948);

    }
}
