package org.lf2020.m3.d04;

/**
 * @ClassName: Student
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/3/4 8:40
 */
public class Student {
    private Student(){};//构造方法私有化,不让外部访问
    private static Student s=null;//创建一个类变量,以此控制只有一个实例.
    public  static Student getInstance(){//添加synchronized关键字保证线程安全
        if(s==null){
            s=new Student();
        }
        return s;
    }

}
