package org.lf2020.m2.f07;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

/**
 * @ClassName: IODemo5
 * @Description: 输出文件夹下以.java后缀名结尾的文件方法2
 * @Author: 梁飞
 * @Date: 2020/2/7 11:32
 */
public class IODemo5 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\Project\\BulkInsert\\src");
        File[] fs = file.listFiles(new FilenameFilter(){
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir,name).isFile() && name.endsWith(".java");
            }
        });
        for(File f :fs){
            System.out.println(f.getName());
        }
    }
}
