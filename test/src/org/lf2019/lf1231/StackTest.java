package org.lf2019.lf1231;

/**
 * @ClassName: StackTest
 * @Description: 模拟栈测试
 * @Author: 梁飞
 * @Date: 2019/12/31
 */
public class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.add("java");
        stack.add("hello");
        stack.add("stack");
        stack.add("java");
        stack.add("hello");
        stack.add("stack");
        stack.add("321");
        stack.add("234");
        stack.add("542");


        while(!stack.isEmpty()){
            System.out.println(stack.get());
        }



    }
}
