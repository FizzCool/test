package org.lf2020.m2.f20;

import java.util.Properties;
import java.util.Set;

/**
 * @ClassName: PropertiesDemo2
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/2/20 10:52
 */
public class PropertiesDemo2 {
    public static void main(String[] args) {
        Properties p = new Properties();
        p.setProperty("1号","小明");
        p.setProperty("2号","小红");
        p.setProperty("3号","小白");
        Set<String> keys = p.stringPropertyNames();
        for(String key :keys){
            System.out.println(key+""+p.getProperty(key));
        }
    }
}
