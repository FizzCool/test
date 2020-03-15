package org.lf2020.m2.f11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ClassName: FileInputStreamTest
 * @Description:
 * @Author: 梁飞
 * @Date: 2020/2/11 10:28
 */
public class FileInputStreamTest {
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        int by;
        byte[] bytes= new byte[5];
        int len;
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("D:\\log\\Test.mp4");
            fos = new FileOutputStream("D:\\Test.mp4");
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes,0,len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null)
                    fis.close();
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("用时:"+(end-begin)+"ms");
    }
}
