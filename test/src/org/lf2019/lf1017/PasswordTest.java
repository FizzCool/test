package org.lf2019.lf1017;

import java.util.Scanner;

public class PasswordTest {
    public static void main(String[] args) {

        /**
         * 需求接收一个不超过8位的整数
         * 12345678
         * 1.倒序
         * 2.每位+5
         * 3.模除10取余
         * 4.第一位和最后一位交换
         * 输出加密后的密码
         */
        System.out.println("请输入一个不超过8位的数字密码");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        System.out.println("输入的数字是"+number);
        int[] arr=new int[8];
        System.out.println(number%10);
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        int index=0;
        //先存成一个数组
        while(number>0){

            arr[index]=number%10;
            index++;
            number/=10;
        }
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]);
        }
        System.out.println();

    }
}
