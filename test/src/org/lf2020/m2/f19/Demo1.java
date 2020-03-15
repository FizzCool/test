package org.lf2020.m2.f19;

import java.io.FileReader;
import java.io.IOException;

/**
 * @ClassName: Demo1
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/2/19 12:07
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        MyBufferedReader mbr = new MyBufferedReader(new FileReader("1.txt"));
        String line;
        while((line=mbr.readLine())!=null){
            System.out.println(line);
        }
        mbr.close();
    }
}
