package org.lf2020.m2.f17;

import java.io.*;

/**
 * @ClassName: BuffererCharDemo
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/2/18 19:45
 */
public class BuffererCharDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("3.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("4.txt"));
        String line;
        while((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
        }
        bw.write("皮卡丘");
        br.close();
        bw.close();
    }
}
