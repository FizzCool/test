package org.lf2019.lf1024;

public class Outer {
    int age = 5;

    public class inner {
        int age = 6;

        public void show() {
            int age = 7;
            System.out.println(Outer.this.age);
        }
    }


}
