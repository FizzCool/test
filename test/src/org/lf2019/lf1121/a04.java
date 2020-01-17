package org.lf2019.lf1121;

/**
 * @ClassName: a04
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2019/11/21
 */
public class a04 {
    public static void main(String[] args) {
        int[] i = {0,1,0,1,2,0,1,2,3,0,1,2,4,5,6,-7,-9,0,1,2,3,4,5,6,7,8,9,10,15,18,1,2,3,4,5,0,1,2,3,0,1,2};
        int count = 0;
        int max = 0;
        int index = 0;
        for(int x =0;x<i.length-1;x++){
            if(i[x+1]>i[x]){
                count++;
            }else{
                if(max<count){
                    max = count;
                    index = x - max;
                    count = 0;
                }
            }
        }
        for(int x = index;x<index+max+1;x++){
            System.out.print(i[x]);
        }
        /*TreeSet<Integer> set = new TreeSet<>();

        for (int temp:i
             ) {
            set.add(temp);
        }
        for (int temp2:set
             ) {
            System.out.print(temp2);
        }*/
    }

}


