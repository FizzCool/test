package org.lf2019.lf1015;


import java.util.LinkedList;

public class ArrayListExample {
    public static void main(String[] args) {
        LinkedList<String> a = new LinkedList<String>();
        a.add("小李");
        a.add("小张");
        a.add("小王");
//        a.remove("小王");
        System.out.println(a.isEmpty());
        System.out.println(a);

    }
}
