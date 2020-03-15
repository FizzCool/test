package org.lf2020.m2.f17;

import java.io.*;

/**
 * @ClassName: CopyDemo3
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/2/18 19:29
 */
public class CopyDemo3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("3.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("4.txt"));
        int ch;
        while((ch=br.read())!=-1){
            System.out.print((char)ch);
            bw.write(ch);
        }
        br.close();
        bw.close();
    }
}
