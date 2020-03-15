package org.lf2020.m2.f07;

import java.io.File;
import java.io.IOException;

/**
 * @ClassName: IODemo7_1
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/2/7 15:22
 */
public class IODemo7_1 {
    public static void main(String[] args) throws IOException {
        File file = new File("d:\\Test\\01\\02");
        System.out.println(file.mkdirs());
        for(int i =0 ;i<10;i++){
            new File(file,""+i+".txt").createNewFile();
        }
    }
}
