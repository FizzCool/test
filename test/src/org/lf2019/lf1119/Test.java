package org.lf2019.lf1119;

/**
 * @ClassName: SortTest
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2019/11/19
 */
public class Test {
    public static void main(String[] args) {
        int[] i ={0,1,2,3,4,5,6,7,8,9};
        int index = Search.binarySearch0(i,0,i.length,-1);
        System.out.println(index);


    }
}
