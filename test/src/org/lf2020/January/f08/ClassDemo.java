package org.lf2020.January.f08;

/**
 * @ClassName: ClassDemo
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/1/8
 */
public class ClassDemo {
    public static void main(String[] args) {
        try {
            Class class1 = Class.forName("org.lf2020.January.f08.Student");
            Student student = (Student)class1.newInstance();
            System.out.println(student);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

    }
}
