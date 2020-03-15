package org.lf2020.m2.f19;

import java.io.*;

/**
 * @ClassName: Demo4
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/2/19 18:20
 */
public class Demo4 {
    public static void main(String[] args) throws IOException {
        PrintStream ps = new PrintStream(new FileOutputStream("1.txt"),true);
        ps.println("Hello");
        PrintWriter pw = new PrintWriter(new FileWriter("1.txt"),true);

    }
}
