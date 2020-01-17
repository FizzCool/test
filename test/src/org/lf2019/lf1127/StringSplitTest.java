package org.lf2019.lf1127;

/**
 * @ClassName: StringSplitTest
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2019/11/27
 */
public class StringSplitTest {
    public static void main(String[] args) {
        String s = "我 张 子 愚 很 C";
        String[] ss = s.split(" ");
        StringBuffer sb = new StringBuffer();
        for(String st:ss){
            sb.append(st);
        }
        System.out.println(sb);
    }

}
