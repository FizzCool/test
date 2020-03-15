package org.lf2020.m2.f18;

import java.io.*;

/**
 * @ClassName: CopyDemo1
 * @Description: 复制文本文件
 * @Author: 梁飞
 * @Date: 2020/2/18 21:53
 */
public class CopyDemo1 {
    public static void main(String[] args) throws IOException {
        String src = "3.txt";
        String dest = "4.txt";
        method5(src,dest);

    }

    public static void method1(String src,String dest)throws IOException {
        FileReader fr = new FileReader(src);
        FileWriter fw = new FileWriter(dest);
        int ch;
        while((ch=fr.read())!=-1){
            fw.write(ch);
        }
        fr.close();
        fw.close();
    }

    public static void method2(String src,String dest)throws IOException {
        FileReader fr = new FileReader(src);
        FileWriter fw = new FileWriter(dest);
        int len;
        char[] chars = new char[1024];
        while((len=fr.read(chars))!=-1){
            fw.write(chars,0,len);
        }
        fr.close();
        fw.close();
    }

    public static void method3(String src,String dest)throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(src));
        BufferedWriter bw = new BufferedWriter(new FileWriter(dest));
        int ch;
        while((ch=br.read())!=-1){
            bw.write(ch);
        }
        br.close();
        bw.close();
    }

    public static void method4(String src,String dest)throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(src));
        BufferedWriter bw = new BufferedWriter(new FileWriter(dest));
        int len;
        char[] chars = new char[1024];
        while((len=br.read(chars))!=-1){
            bw.write(chars,0,len);
        }
        br.close();
        bw.close();
    }

    public static void method5(String src,String dest)throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(src));
        BufferedWriter bw = new BufferedWriter(new FileWriter(dest));
        String line;
        while((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}
