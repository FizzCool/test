package org.lf2020.m3.d07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName: RTDemo
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/3/10 13:10
 */
public class RTDemo {
    public static void main(String[] args) throws IOException {
        Process p = Runtime.getRuntime().exec("D:\\Michelin\\EDI\\Job2\\test\\test1.bat");
        BufferedReader info =new BufferedReader(new InputStreamReader(p.getInputStream(),"GBK"));
        BufferedReader error =new BufferedReader(new InputStreamReader(p.getErrorStream(),"GBK"));
        String infoS;
        String errorS;
        while((infoS=info.readLine())!=null){
            System.out.println("INFO:"+infoS);
        }
        System.out.println(p.getErrorStream());
        while((errorS=error.readLine())!=null){
            System.out.println("ERROR:"+errorS);
        }


    }
}
