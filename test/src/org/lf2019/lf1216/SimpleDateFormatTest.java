package org.lf2019.lf1216;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName: SimpleDateFormatTest
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2019/12/16
 */
public class SimpleDateFormatTest {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String s = format.format(date);
        System.out.println(s);
        String s2 = "2019年10月22日 16:00:00";
        Date d=format.parse(s2);
        System.out.println("Date:"+d);
        System.out.println(format.format(d));
    }
}
