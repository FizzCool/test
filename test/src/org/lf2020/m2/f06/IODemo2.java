package org.lf2020.m2.f06;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName: IODemo2
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/2/6 16:59
 */
public class IODemo2 {
    public static void main(String[] args) throws IOException {
        File file = new File("01.txt");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.getName());
        System.out.println(file.length());
        long time = file.lastModified();
        Date date = new Date(time);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(date));
    }
}
