package org.lf2019.lf1017;

public class ParameterTest {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("a:"+a+"\t"+"b:"+b);
        change(a,b);
        System.out.println("a:"+a+"\t"+"b:"+b);
        int[] ara = new int[10];
        int[] arr={1,2,3,4,5};
        System.out.println(arr[1]);
        change(arr);
        System.out.println(arr[1]);
    }
    public static void change(int a,int b){
        System.out.println(a+b);
        a=b;
        b=a+b;
        System.out.println("a:"+a+"\t"+"b:"+b);

    }
    public static  void change(int[] arr){
        for(int i=0;i<arr.length;i++){
            if((arr[i]%2)==0){
                arr[i]*=2;
            }
        }
    }

}
