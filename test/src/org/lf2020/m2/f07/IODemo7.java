package org.lf2020.m2.f07;

import java.io.File;
import java.io.IOException;

/**
 * @ClassName: IODemo7
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/2/7 15:05
 */
public class IODemo7 {
    public static void main(String[] args) throws IOException {
        File file = new File("d:\\Test");
        delete(file);

    }
    public static void delete(File file){
        File[] fs = file.listFiles();
        for(File f:fs){
            if(f.isDirectory()){
                delete(f);
            }
            else{
                System.out.println(f.getName()+"----"+f.delete());
            }
        }
        System.out.println(file.getName()+"----"+file.delete());
    }
}
