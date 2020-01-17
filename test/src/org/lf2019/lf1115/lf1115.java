package org.lf2019.lf1115;

/**
 * @ClassName: lf1115
 * @Description: String测试
 * @Author: 梁飞
 * @Date: 2019/11/15
 */
public class lf1115 {
    public static void main(String[] args) {
        String s= "我张子愚第一个不服我张子愚第一个我张子愚我我我我我我我";
       int n =search(s,"我");
        System.out.println(n);

}

 public  static String reverse(String s){
        String newString = "";
        for(int i = (s.length()-1);i>=0;i--){
            newString += s.charAt(i);
        }

        return newString;
 }

 public static String flashback(String s){
     String newString = "";
     char[] chars = s.toCharArray();
     for(int i = chars.length-1;i>=0;i--){
         newString +=chars[i];
     }
     return newString;
 }

 public static int search(String father,String child){
     int count = 0;
    int index= father.indexOf(child);
     while((index )!=-1){
         count++;
         //father = father.substring(index+child.length());
         index = father.indexOf(child,index+child.length());
     };
     return  count;
 }
}
