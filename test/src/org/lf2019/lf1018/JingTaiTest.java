package org.lf2019.lf1018;

import java.util.Scanner;

public class JingTaiTest {
    public static void main(String[] args) {
        int number = (int)(Math.random()*100+1);

        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入一个数1~100");
            int guss = sc.nextInt();
            if(guss>number){
                System.out.println("你输入的数"+guss+"大了");
            }
            else if(guss<number){
                System.out.println("你输入的数"+guss+"小了");
            }
            else {
                System.out.println("恭喜你，猜中了！");
                break;
            }


        }

    }



}

