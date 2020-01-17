package org.lf2019.lf1115;

/**
 * @ClassName: l02
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2019/11/15
 */
public class l02 {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer();
        StringBuffer s2 = new StringBuffer(50);
        StringBuffer s3 = new StringBuffer("hello");
        System.out.println("----------------------------");
        show(s1);
        show(s2);
        show(s3);


    }
    public static void show(StringBuffer s){
        System.out.println(s);
        System.out.println(s.capacity());
        System.out.println(s.length());
        System.out.println("----------------------------");
    }
}
