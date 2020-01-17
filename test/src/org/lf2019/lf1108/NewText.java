package org.lf2019.lf1108;

/**
 * @ClassName: NewText
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2019/11/8
 */
public class NewText {
    public static void main(String[] args) {
        String s1 = "123456";
        String s2 = "abcdef";
        byte[] bytes = s1.getBytes();
        char[] chars = s2.toCharArray();
        for(int i = 0;i<bytes.length;i++)
        System.out.print(bytes[i]+"\t");
        System.out.println(chars);
    }
}
