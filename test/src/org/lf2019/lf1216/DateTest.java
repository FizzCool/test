package org.lf2019.lf1216;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @ClassName: DateTest
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2019/12/16
 */
public class DateTest {
    public static void main(String[] args) throws ParseException {
        System.out.println(new Date());
        System.out.println(new Date(40*365*24*60*60*1000));
        numOfTheDayUdLive();
    }
    public static void numOfTheDayUdLive() throws ParseException {
        System.out.println("请输入你的出生年月日，格式（yyyymmdd）");
        Scanner sc = new Scanner(System.in);
        String birthday = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Date birth = sdf.parse(birthday);
        Date today = new Date();
        long days = (today.getTime()-birth.getTime())/(1000*60*60*24);
        System.out.println("您已经在这个世界上度过了："+days+"天");
    }
}
