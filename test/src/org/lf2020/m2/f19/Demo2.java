package org.lf2020.m2.f19;

import java.io.FileReader;
import java.io.IOException;

/**
 * @ClassName: Demo2
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/2/19 12:30
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        MyLineNumberReader2 mnr = new MyLineNumberReader2(new FileReader("2.txt"));
        String line;
        while((line=mnr.readLine())!=null){
            System.out.println(mnr.getLineNumber()+":"+line);
        }
        mnr.close();

    }
}
