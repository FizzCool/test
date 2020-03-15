package org.lf2020.m2.f11;

import java.io.*;

/**
 * @ClassName: BufferedIOStreamDemo
 * @Description: 用BufferedIO实现复制mp4
 * @Author: 梁飞
 * @Date: 2020/2/11 14:50
 */
public class BufferedIOStreamDemo {
    public static void main(String[] args) throws IOException {
        long begin = System.currentTimeMillis();
        String src = "D:\\log\\Test.mp4";
        String dest = "D:\\dest.mp4";
        method2(src,dest);
        long end = System.currentTimeMillis();
        System.out.println("用时:"+(end-begin)+"ms");
    }

    public static void method1(String src,String dest) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));
        int by;
        while((by=bis.read())!=-1){
            bos.write(by);
        }
    }

    public static void method2(String src,String dest) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));
        byte[] bytes = new byte[1024];
        int length;
        while((length=bis.read(bytes))!=-1){
            bos.write(bytes,0,length);
        }
    }
}

