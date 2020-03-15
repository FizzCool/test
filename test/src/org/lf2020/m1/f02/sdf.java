package org.lf2020.m1.f02;



/**
 * @ClassName: sdf
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/1/2
 */
public class sdf {
    public static void main(String[] args) {
        Content c = new Content();
        c.setObject("张子愚");
        String s = (String)c.getObject();
        System.out.println(s);

        c.setObject(new Integer(100));
        Integer i = (Integer)c.getObject();
        System.out.println(i);

        c.setObject(new Integer(1000));
        String ss = (String)c.getObject();
        System.out.println(ss);
    }
}
