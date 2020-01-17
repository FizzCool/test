package org.lf2019.lf1209;

/**
 * @ClassName: Person
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2019/12/9
 */
public class Person {
    private String name;
    private  int age;

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

    @Override
    protected void finalize() throws Throwable {
        System.out.println("当前对象被回收了"+this);
        super.finalize();
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
