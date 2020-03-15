package org.lf2020.m2.f06;

import java.io.File;
import java.io.IOException;

/**
 * @ClassName: IODemo4
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/2/6 15:37
 */
public class IODemo {
    public static void main(String[] args) throws IOException {
        File file = new File("2.txt");
//        file.createNewFile();
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file.exists());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.isHidden());

    }
}
