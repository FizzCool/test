package org.lf2020.m3.d13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @ClassName: Test
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/3/13 16:37
 */
public class Test {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s =null;
        while((s=br.readLine())!=null){
            System.out.println("输出:"+s);
        }
    }

}
