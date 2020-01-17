import java.util.Arrays;

public class SortTest {
    public static void main(String[] args) {
        int[] i = {0,1,0,1,2,0,1,2,3,0,1,2,4,5,6,-7,-9,0,1,2,3,4,5,6,7,8,9,10,15,18,1,2,3,4,5,0,1,2,3,0,1,2};
        int[] i2 = {1,2,3,4,5,6,1,2,1,2,3,4,5,6,7,1,2};
        int[] i3 = {5,4,2,3,1};
        int[] i4 = {1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2};
        show(i4);
    }

    //打印数组里的最大递增字串
    public static void show(int[] i){
        int count = 1;
        int maxLength = 0;
        int index = 0;
        for(int x= 0;x<i.length-1;x++){
            if(i[x]<i[x+1]){
                count++;
            }
            else{
                if(count>maxLength){
                    maxLength=count;
                    index = x+1-count;
                }
                count = 1;
            }
        }
        int[] ni = Arrays.copyOfRange(i,index,(index+maxLength));
        System.out.println(Arrays.toString(ni));
    }

}
