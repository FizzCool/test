package org.lf2019.lf1216;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @ClassName: CalendarTest
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2019/12/16
 */
public class CalendarTest {
    public static void main(String[] args) {
        while(true){
            showNumOfFebruary();
        }

    }
    public static void test(){
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        System.out.println(year+"年"+(month+1)+"月"+day+"日"+hour+"时"+minute+"分"+second+"秒");


        calendar.set(2018,11,15,15,54,14);
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);
        hour = calendar.get(Calendar.HOUR_OF_DAY);
        minute = calendar.get(Calendar.MINUTE);
        second = calendar.get(Calendar.SECOND);
        System.out.println(year+"年"+(month+1)+"月"+day+"日"+hour+"时"+minute+"分"+second+"秒");
    }
    //判断某一年二月有多少天
    public static void showNumOfFebruary(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = sc.nextInt();
        Calendar c = Calendar.getInstance();
        c.set(year,2,1);
        c.add(Calendar.DAY_OF_MONTH,-1);
        int FebDays =c.get(Calendar.DAY_OF_MONTH);
        System.out.println("此年二月共有"+FebDays+"天");

    }
}
