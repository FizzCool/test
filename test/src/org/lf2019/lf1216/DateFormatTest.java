package org.lf2019.lf1216;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName: DateFormatTest
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2019/12/16
 */
public class DateFormatTest {
    public static void main(String[] args) {
        Date d = new Date();
        SimpleDateFormat  df = new SimpleDateFormat();
        String s = df.format(d);
        System.out.println(s);
    }
}
