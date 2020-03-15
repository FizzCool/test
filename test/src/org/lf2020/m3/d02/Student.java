package org.lf2020.m3.d02;

/**
 * @ClassName: Student
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/3/2 13:25
 */
public class Student {
    private boolean flag = false;

    public boolean getFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    private String name;
    private int age;

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

    public Student(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public Student() {
        super();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public synchronized void set(String name,int age){
        if(this.getFlag()){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.name = name;
        this.age = age;
        this.setFlag(true);
        this.notify();
    }

    public synchronized void get(){
        if (!this.getFlag()) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(this.toString());
        this.setFlag(false);
        this.notify();
    }
}
