package org.lf2020.m2.f17;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName: ISRDemo
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/2/17 12:04
 */
public class ISRDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("1.txt"),"GBK");
        int ch=0;
        while((ch=isr.read())!=-1){
            System.out.print((char)ch);
        }
    }
}
