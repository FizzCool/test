package org.lf2020.m2.f18;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * @ClassName: IODemo3
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/2/18 23:31
 */
public class IODemo3 {
    public static void main(String[] args) throws IOException {
        Set<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num0 = s1.getMath()-s2.getMath();
                int num1=num0==0?num0:s1.getChinese()-s2.getChinese();
                int num2=num1==0?num1:s1.getEnglish()-s2.getEnglish();
                int num3=num2==0?num2:s1.getName().compareTo(s2.getName());
                return num3;
            }
        });

        for(int i=0;i<5;i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入学生姓名:");
            String name = sc.nextLine();
            System.out.println("请输入学生数学成绩:");
            int Math = sc.nextInt();
            System.out.println("请输入学生语文成绩:");
            int Chinese = sc.nextInt();
            System.out.println("请输入学生英语成绩:");
            int English = sc.nextInt();
            Student s = new Student(name,Math,Chinese,English);
            ts.add(s);
        }
        BufferedWriter bw = new BufferedWriter(new FileWriter("1.txt"));
        char[] chars = new char[1024];
        for(Student s :ts){
            bw.write(s.toString());
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
