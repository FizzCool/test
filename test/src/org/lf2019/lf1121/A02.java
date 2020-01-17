package org.lf2019.lf1121;

import java.util.Scanner;

/**
 * @ClassName: A02
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2019/11/21
 */
public class A02 {
    public static void main(String[] args) {
        System.out.println(judge());

    }
    private static boolean judge(){
        System.out.println("请输入邮箱：");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String regex = "\\w+@\\w{2,6}(\\.\\w{2,3})+";
        return s.matches(regex);
    }
}
