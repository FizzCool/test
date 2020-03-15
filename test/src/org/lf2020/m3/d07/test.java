package org.lf2020.m3.d07;

import java.io.IOException;

/**
 * @ClassName: test
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/3/9 14:31
 */
public class test {
    public static void main(String[] args) throws IOException {
        Process p = Runtime.getRuntime().exec("D:\\Michelin\\EDI\\Job2\\test\\test.bat");
        ErrorManager error = new ErrorManager(p);
        InfoManager info = new InfoManager(p);
        error.start();
        info.start();

        if(error.isError()){
            System.exit(0);
        }


    }
}
