package org.lf2019.lf1024;

public class Student implements  Cloneable{
    private String name;
    private int age;
    private String address;

    public Student(){
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
   /* @Override
    public boolean equals(Object obj){
        Student s =(Student)obj;
        if(this.name==s.name && this.age == s.age)
        return true;
        else
            return false;
}*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        if (!name.equals(student.name)) return false;
        return address.equals(student.address);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Student(String name) {
        super();
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
