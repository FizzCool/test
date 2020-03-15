package org.lf2020.m2.f17;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @ClassName: CopyDemo2
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/2/18 19:03
 */
public class CopyDemo2 {
    public static void main(String[] args)throws IOException {
        FileReader fr = new FileReader("2.txt");
        FileWriter fw = new FileWriter("3.txt",true);
        int len;
        char[] chars = new char[1024];
        while((len=fr.read(chars))!=-1){
            fw.write(chars,0,len);
        }
        fr.close();
        fw.close();


    }
}
