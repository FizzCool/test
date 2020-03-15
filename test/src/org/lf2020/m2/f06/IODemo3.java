package org.lf2020.m2.f06;

import java.io.File;
import java.io.IOException;

/**
 * @ClassName: IODemo3
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/2/6 17:24
 */
public class IODemo3 {
    public static void main(String[] args) throws IOException {
        File file = new File("e:\\");
        String[] strArray = file.list();
        for(String s :strArray){
            System.out.println(s);
        }
        File[] fs = file.listFiles();
        for(File f :fs){
            System.out.println(f.getPath());
        }
    }
}
