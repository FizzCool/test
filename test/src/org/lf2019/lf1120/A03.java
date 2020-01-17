package org.lf2019.lf1120;

/**
 * @ClassName: A03
 * @Description: 结果：子类可以通过父类的公有方法访问父类的私有方法。子类无法直接调用父类私有方法。
 * 这似乎涉及到底层的，继承父类的子类方法在内存中的存储方式有关，有待考证。
 * @Author: 梁飞
 * @Date: 2019/11/20
 */
public class A03 {
    public static void main(String[] args) {
        A02 a = new A02();
        int[] ints= {1,2,3,4,5,6};
        int i = a.binarySearch(ints,4);


    }
}
