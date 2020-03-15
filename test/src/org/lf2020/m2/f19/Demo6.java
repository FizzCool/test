package org.lf2020.m2.f19;

import java.io.*;

/**
 * @ClassName: Demo6
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/2/19 19:41
 */
public class Demo6 {
    public static void main(String[] args) throws IOException {
        InputStream is1 = new FileInputStream("1.txt");
        InputStream is2 = new FileInputStream("3.txt");
        SequenceInputStream sis = new SequenceInputStream(is1,is2);
        byte[] bytes=new byte[1024];
        int len;
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("01.txt"));
        while((len=sis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
        sis.close();
        bos.close();
    }
}
