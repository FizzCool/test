package org.lf2020.m1.f03;

/**
 * @ClassName: Person
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/1/3
 */
public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        int num= this.age-o.age;
        int num0 = num==0?this.name.compareTo(o.name):num;
        return num0;
    }
}
