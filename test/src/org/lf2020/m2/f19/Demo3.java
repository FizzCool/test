package org.lf2020.m2.f19;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * @ClassName: Demo3
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/2/19 16:03
 */
public class Demo3 {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        for(int i =0;i<10;i++){
            bos.write(("hello"+i).getBytes());
        }
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        int ch;
        while((ch=bis.read())!=-1){
            System.out.print((char)ch);
        }
    }
}
