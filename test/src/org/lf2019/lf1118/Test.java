package org.lf2019.lf1118;

import java.util.Arrays;

/**
 * @ClassName: SortTest
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2019/11/18
 */
public class Test {
    public static void main(String[] args) {
        int[] i={9,8,7,6,5,4,3,2,1,0};
        ArrayRanking.maopao(i);
        ArrayRanking.printArray(i);
        Arrays.sort(i);


        /*ArrayRanking.chose(i);
        ArrayRanking.printArray(i);*/
    }
}
