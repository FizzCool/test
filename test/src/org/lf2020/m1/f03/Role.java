package org.lf2020.m1.f03;

/**
 * @ClassName: Role
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/1/3
 */
public class Role {
    private String name;
    private String area;

    public Role() {
        super();
    }

    public Role(String name, String area) {
        this.name = name;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Role{" +
                "name='" + name + '\'' +
                ", area='" + area + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Role role = (Role) o;

        if (!name.equals(role.name)) return false;
        return area.equals(role.area);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + area.hashCode();
        return result;
    }
}
