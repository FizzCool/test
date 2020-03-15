package org.lf2020.m2.f08;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ClassName: IODemo1
 * @Description: 创建一个字节输出流并写入文件
 * @Author: 梁飞
 * @Date: 2020/2/8 14:00
 */
public class IODemo1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("Test.txt",true);
        for(int i=0;i<10;i++){
            fos.write(("Hello"+i).getBytes());
            fos.write("\r".getBytes());
        }
        fos.close();
    }
}
