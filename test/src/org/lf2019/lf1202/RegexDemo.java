package org.lf2019.lf1202;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName: RegexDemo
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2019/12/2
 */
public class RegexDemo {
    public static void get() {
        String s = "jin tain fang jia bu shang ke , ni men kai xin me ?";
        String regex = "\\b\\w{3}\\b";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        while(m.find()){
            System.out.println(m.group());
        }
    }
    public static void gain(String s){
        String regex = "\\b\\w{4}\\b";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(regex);
    }


}
