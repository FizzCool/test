package org.lf2019.lf1118;

import java.util.Scanner;

/**
 * @ClassName: lf1118
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2019/11/18
 */
public class lf1118 {
    public static void main(String[] args) {
        String s1 =new String("Hello");
        String s2 = new String("world");
        System.out.println(s1+"-----"+s2);
        change(s1,s2);
        System.out.println(s1+"-----"+s2);
        s1=s2;
        s2=s2+s1;
        System.out.println(s1+"-----"+s2);
        System.out.println("==========================");
        StringBuffer sb1 = new StringBuffer("Hello");
        StringBuffer sb2 = new StringBuffer("world");
        System.out.println(sb1+"-----"+sb2);
        change(sb1,sb2);
        System.out.println(sb1+"-----"+sb2);
    }

    public static boolean same(String s) {
        boolean flag = true;
        for (int i = 0, j = s.length() - 1; i <= j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void symmetric(){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(new StringBuffer(s).reverse().toString().equals(s));
    }

    public static void change(String s1,String s2){
        s1=s2;
        s2 = s1 + s2;
        System.out.println(s1);
        System.out.println(s2);
    }
    public  static void change(StringBuffer sb1,StringBuffer sb2){
        sb1=sb2;
        sb2.append(sb1);
        System.out.println(sb1);
        System.out.println(sb2);
    }
}
