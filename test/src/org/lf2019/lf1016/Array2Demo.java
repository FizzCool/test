package org.lf2019.lf1016;

import java.util.Scanner;

public class Array2Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入行数");
        int x = sc.nextInt();
        int[][] a = new int[x][x];
        for (int i = 0;i<x;i++){
            a[i][0]=1;
            a[i][i]=1;
        }
        for(int i=2;i<x;i++){
            for(int j=1;j<i;j++){
                a[i][j]=a[i-1][j-1]+a[i-1][j];
            }
        }
        for(int i=0;i<x;i++){
            for(int j=0;j<=i;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
