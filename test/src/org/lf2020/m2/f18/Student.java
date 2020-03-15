package org.lf2020.m2.f18;

/**
 * @ClassName: Student
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/2/18 23:28
 */
public class Student {
    private String name;
    private int Math;
    private int Chinese;
    private int English;

    public Student(String name, int math, int chinese, int english) {
        this.name = name;
        Math = math;
        Chinese = chinese;
        English = english;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMath() {
        return Math;
    }

    public void setMath(int math) {
        Math = math;
    }

    public int getChinese() {
        return Chinese;
    }

    public void setChinese(int chinese) {
        Chinese = chinese;
    }

    public int getEnglish() {
        return English;
    }

    public void setEnglish(int english) {
        English = english;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (Math != student.Math) return false;
        if (Chinese != student.Chinese) return false;
        if (English != student.English) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + Math;
        result = 31 * result + Chinese;
        result = 31 * result + English;
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", Math=" + Math +
                ", Chinese=" + Chinese +
                ", English=" + English +
                '}';
    }
}
