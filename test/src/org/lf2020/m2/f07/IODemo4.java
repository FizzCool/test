package org.lf2020.m2.f07;

import java.io.File;
import java.io.IOException;

/**
 * @ClassName: IODemo4
 * @Description: 输出文件夹下以.java后缀结尾的文件
 * @Author: 梁飞
 * @Date: 2020/2/7 11:08
 */
public class IODemo4 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\Project\\BulkInsert\\src");
        File[] fs = file.listFiles();
        for(File f:fs){
            if(f.isFile()){
                if(f.getName().endsWith(".java")){
                    System.out.println(f.getName());
                }
            }
        }
    }
}
