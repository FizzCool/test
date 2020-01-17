package org.lf2019.lf1118;

/**
 * @ClassName: newcalss
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2019/11/18
 */
public class newcalss {
    public static void main(String[] args) {
        int[] i = {51,41,31,2,11,0};
        bubblesout(i);
        ArrayRanking.printArray(i);

    }

    public static void bubblesout(int[] a) {
        int temp;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }

}
