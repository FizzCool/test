package org.lf2019.lf1216;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * @ClassName: BigIntegerTest
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2019/12/16
 */
public class BigIntegerTest {
    public static void main(String[] args) {
        test2();
    }

    public static void test1(){
        Integer i = new Integer(Integer.MAX_VALUE);
        // Integer i2 = new Integer(2147483648);
        BigInteger b = new BigInteger("2147483648");
        System.out.println(i);
        System.out.println(b);
    }

    public static void test2(){
        BigInteger b1 = new BigInteger("100");
        BigInteger b2 = new BigInteger("50");
        System.out.println(b1.add(b2));
        System.out.println(b1.subtract(b2));
        System.out.println(b1.multiply(b2));
        System.out.println(b1.divide(b2));
        System.out.println(Arrays.toString(b1.divideAndRemainder(b2)));
    }

}
