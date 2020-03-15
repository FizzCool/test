package org.lf2020.m2.f17;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @ClassName: test1
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/2/17 10:15
 */
public class test1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("1.txt");
        byte[] bytes = new byte[1024];
        int len;
        while((len=fis.read(bytes))!=-1){
            System.out.print(new String(bytes,0,len));
        }
    }
}
