package org.lf2019.lf1030;

import java.util.Scanner;

/**
 * @ClassName: GussNumberGame
 * @Description: 猜字小游戏
 * @Author: 梁飞
 * @Date: 2019/11/7
 */
public class GussNumberGame {
    //游戏方法
    public static void game(){
        System.out.println("游戏开始！");
        int steps = 0;
        int n = (int)(Math.random()*100+1);
        while(true){
            ++steps;
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入您所猜测的数字：(1~100)");
            int a = sc.nextInt();
            if(a>n){
                System.out.println("您猜的数字"+a+"大了");
            }
            else if(a<n){
                System.out.println("您猜的数字"+a+"小了");
            }
            else{
                System.out.println("恭喜您猜对了!本次一共用了"+steps+"步！");
                System.out.println("再来一局请输入1，结束请输入0");
                int status = sc.nextInt();
                if(status == 1){
                    game();
                }
                else if(status != 0){
                    System.out.println("您的输入有误，请重新输入");
                }
                else{
                    System.out.println("欢迎再次挑战！");
                }
                break;
            }
        }

    }

    public static void startGame(){
        System.out.println("欢迎来到猜数字游戏！");
        game();
    }


}
