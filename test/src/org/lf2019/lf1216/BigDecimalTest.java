package org.lf2019.lf1216;

import java.math.BigDecimal;

/**
 * @ClassName: BigDecimalTest
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2019/12/16
 */
public class BigDecimalTest {
    public static void main(String[] args) {
        bigDecimal();
    }

    public static void problem(){
        System.out.println(0.09+0.01);
    }
    public static void bigDecimal(){
        BigDecimal b = new BigDecimal("1.015");
        BigDecimal b2 = new BigDecimal("100");
        System.out.println(b.divide(b2));
        System.out.println(b.divide(b2,8,BigDecimal.ROUND_HALF_DOWN));
    }


}
