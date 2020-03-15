package org.lf2020.m2.f19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName: Demo5
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/2/19 18:53
 */
public class Demo5 {
    public static void main(String[] args) throws IOException {
        BufferedReader fr = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请入如字符串:");
        String line = fr.readLine();
        System.out.println("你输入的字符串是:"+line);
    }
}
