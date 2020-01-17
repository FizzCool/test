package org.lf2019.lf1024;

public class StudentTest {


    public static void main(String[] args) throws CloneNotSupportedException{
       Student s1 = new Student();
       Student s2 = new Student();

        Object o1 = s1.clone();
        System.out.println(o1);

    }
}
