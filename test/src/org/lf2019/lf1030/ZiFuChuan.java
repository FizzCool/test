package org.lf2019.lf1030;

import java.util.Scanner;

public class ZiFuChuan {
    public static void main(String[] args) {
        String username = "admin";
        String password = "123456";
        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名 ：");
            String un = sc.nextLine();
            System.out.println("请输入密码：");
            String pwd = sc.nextLine();
            if(un.equals(username) && pwd.equals(password)){
                System.out.println("登录成功！");
                GussNumberGame.startGame();
                break;
            }
            else{
                if((2-i)==0){
                    System.out.println("您的账号已被冻结，请与管理员联系");
                }
                else
                System.out.println("用户名或密码错误,您还有"+(2-i)+"次机会");
            }

        }
    }
}
