package org.lf2019.lf1126;

/**
 * @ClassName: RegexTest
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2019/11/26
 */
public class RegexTest {


    public static void main(String[] args) {
        String s = "123";
        int i = Integer.parseInt(s)+1;
        System.out.println(i);
        String s2="           1             ".trim();
        System.out.println(s2);
        StringBuilder sb = new StringBuilder();
        for(int j = 0;j<5;j++){
            sb.append(" ").append(j).append(" ");
        }
        System.out.println("sb:"+sb);
        String s3 = sb.toString().trim();
        System.out.println("s3:"+s3);
        StringBuilder sb2 = new StringBuilder("张子愚sb");
        String s4 = String.valueOf(1234567878);

    }

}
