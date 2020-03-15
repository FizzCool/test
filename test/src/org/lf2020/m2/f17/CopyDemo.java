package org.lf2020.m2.f17;

import java.io.*;

/**
 * @ClassName: CopyDemo
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/2/18 18:50
 */
public class CopyDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("2.txt"));
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("3.txt"));
        int len;
        char[] chars = new char[1024];
        while((len=isr.read(chars))!=-1){
            osw.write(chars,0,len);
        }
        isr.close();
        osw.close();
    }
}
