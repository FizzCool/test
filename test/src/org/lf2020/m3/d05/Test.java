package org.lf2020.m3.d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @ClassName: Test
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/3/5 15:20
 */
public class Test {
    public static void main(String[] args) {
        Runtime rt =Runtime.getRuntime();
        try {
            Process p=rt.exec("D:\\Michelin\\EDI\\Job2\\test\\test.bat");
//            p.waitFor();
            InputStream i1 =p.getInputStream();
            InputStreamReader isr1 = new InputStreamReader(i1,"GBK");
            BufferedReader br1 = new BufferedReader(isr1);
            InputStream i2 =p.getErrorStream();
            InputStreamReader isr2 = new InputStreamReader(i2,"GBK");
            BufferedReader br2 = new BufferedReader(isr2);
//            int ev = p.exitValue();
            String line;
            String error;
            while((line=br1.readLine())!=null){
                System.out.println(line);
            }
            while((error=br2.readLine())!=null){
                System.out.println("Error:"+error);
            }
//            System.out.println(ev);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
