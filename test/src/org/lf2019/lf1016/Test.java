package org.lf2019.lf1016;

public class Test {
    public static void main(String[] args) {
        Student s = new Student("小王", 5);
        Student[] st = {
                new Student("mike", 6),
                new Student("lili", 6),
                new Student("gacibi", 30)
        };
        for (int i = 0; i < st.length; i++) {
            System.out.println("姓名：" + st[i].name + "\n" + "年龄：" + st[i].age);
        }
    }
}
