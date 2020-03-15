package org.lf2020.m2.f17;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName: InputStreamReaderDemo
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/2/18 18:42
 */
public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("2.txt"));
        int ch;
        char[] chars = new char[1024];
        int len;
        while((len=inputStreamReader.read(chars))!=-1){
            System.out.print(new String(chars,0,len));
        }
        inputStreamReader.close();
    }
}
