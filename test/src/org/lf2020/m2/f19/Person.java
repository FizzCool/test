package org.lf2020.m2.f19;

import java.io.Serializable;

/**
 * @ClassName: Person
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/2/19 22:47
 */
public class Person implements Serializable {
    private static final long serialVersionUID = -4452260862508641975L;
    private String name;
    private transient int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
