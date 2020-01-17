package org.lf2019.lf1118;

/**
 * @ClassName: ArrayRanking
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2019/11/18
 */
public class ArrayRanking {
//冒泡排序算法
    public static void maopao(int[] x){
        int temp;
        int count = 0;
        for(int i = 0;i<x.length-1;i++){
            for(int j=0;j<x.length-1-i;j++){
                count++;
                if(x[j]>x[j+1]){
                    temp = x[j];
                    x[j]=x[j+1];
                    x[j+1]=temp;
                }
            }
        }
        System.out.println(count);
    }

    //选择排序算法
    public static void chose(int[] x){
        int temp;
        int count = 0;
        for(int i = 0;i<x.length;i++){
            for(int j = i+1;j<x.length;j++){
                count++;
                if(x[i]>x[j]){
                    temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }
        System.out.println(count);
    }
    public static void printArray(int[] x){
        System.out.print("[");
        for(int i = 0;i<x.length-1;i++) System.out.print(x[i]+", ");
        System.out.print(x[x.length-1]+"]");

    }
}
