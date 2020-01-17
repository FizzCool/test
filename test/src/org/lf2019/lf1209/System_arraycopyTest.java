package org.lf2019.lf1209;

import java.util.Arrays;

/**
 * @ClassName: System_arraycopyTest
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2019/12/16
 */
public class System_arraycopyTest {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {11,22,33,44,55};
        System.arraycopy(arr1,2,arr2,2,2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        //int\String 互相转换测试
        String s ="123";
        int i = 987;
        int it1 = Integer.parseInt(s);
        int it2 = Integer.valueOf(s);
        String st1 = Integer.toString(i);
        String st2 = String.valueOf(i);
        System.out.println("Integer.parseInt(s):"+it1);
        System.out.println("Integer.valueOf(s):"+it2);
        System.out.println("Integer.toString(i):"+st1);
        System.out.println("Integer.toString(i):"+st2);


    }
}
