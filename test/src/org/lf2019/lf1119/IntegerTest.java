package org.lf2019.lf1119;

/**
 * @ClassName: IntegerTest
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2019/11/19
 */
public class IntegerTest {
    public static void main(String[] args) {
    int number = 100;
    String s = ""+number;
    System.out.println(s);

    String s2 = String.valueOf(number);
    System.out.println(s2);

    String s3 = new Integer(number).toString();
    System.out.println(s3);

    String s4 = Integer.toString(number);
    System.out.println(s4);

    int a = Integer.parseInt(s4);
        System.out.println(a);
    }
}
