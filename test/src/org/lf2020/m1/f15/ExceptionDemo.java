package org.lf2020.m1.f15;

/**
 * @ClassName: ExceptionDemo
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/1/15
 */
public class ExceptionDemo {
    public static void main(String[] args) throws ArithmeticException{
        int a = 10;
        int b = 0;
        int i[] = {1,2,3};
        try{
            System.out.println(a / b);
            System.out.println(i[3]);
        }
        catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//            System.out.println("----------");
//            System.out.println(e.getLocalizedMessage());
//            System.out.println("----------");
//            e.printStackTrace();
            System.out.println(e.toString());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("索引无效");
        }catch (Exception e){
            System.out.println("Internal exception");
        }

        System.out.println("Application end.");
    }
}
