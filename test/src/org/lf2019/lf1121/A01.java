package org.lf2019.lf1121;

/**
 * @ClassName: A01
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2019/11/21
 */
public class A01 {
    public static void main(String[] args) {
        //正则表达式预定义字符
        //  \d表示0-9
       /* System.out.println("a".matches("\\d"));
        System.out.println(("0789".matches("\\d{4}")));
        System.out.println("a".matches("\\w"));
        System.out.println("17767743659".matches("[1-9]\\d{10}"));
        System.out.println("1776774365".matches("[1-9]\\d{10}"));*/
        /*System.out.println("asd".matches("."));
        System.out.println("1".matches("."));
        System.out.println("a".matches("."));
        System.out.println(".".matches("\\."));*/
        System.out.println("1414010633@qq.com".matches("\\w+@\\w{4,6}(\\.\\w{2,3})+"));
    }
}
