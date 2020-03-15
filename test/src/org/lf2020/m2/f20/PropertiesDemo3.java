package org.lf2020.m2.f20;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @ClassName: PropertiesDemo3
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/2/20 11:13
 */
public class PropertiesDemo3 {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();
//        p.setProperty("1号","小明");
//        p.setProperty("2号","小红");
//        p.setProperty("3号","小白");
//        p.store(new FileWriter("1.txt"),"Hello");
        p.load(new FileReader("1.txt"));
        System.out.println(p.getProperty("3号"));

    }
}
