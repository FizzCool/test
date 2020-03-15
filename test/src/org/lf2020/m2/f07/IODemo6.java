package org.lf2020.m2.f07;

import java.io.File;
import java.io.IOException;

/**
 * @ClassName: IODemo6
 * @Description: 递归获取目录下所有java文件
 * @Author: 梁飞
 * @Date: 2020/2/7 14:32
 */
public class IODemo6 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\Project");
        getAllJavaFiles(file);
    }
    public static void getAllJavaFiles(File file){
        File[] fs = file.listFiles();
        for(File f:fs){
            if(f.isDirectory()){
                getAllJavaFiles(f);
            }
            else{
                if(f.getName().endsWith(".java")){
                    System.out.println(f.getName());
                }
            }
        }
    }
}
