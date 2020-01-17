package org.lf2019.lf1216;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName: DateUtil
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2019/12/16
 */
public class DateUtil {

    public static void main(String[] args) {
        Date date = new Date();
        String s = dateToString(date,"yyyy年");
        System.out.println(s);
    }
    private DateUtil(){}
    public static String dateToString(Date date, String pattern){
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(date);
    }
}
