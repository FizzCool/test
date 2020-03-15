package org.lf2020.m1.f03;

import java.util.HashSet;

/**
 * @ClassName: SetTest
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/1/3
 */
public class SetTest {
    public static void main(String[] args) {
        HashSet<Role> hashSet = new HashSet<Role>();
        hashSet.add(new Role("杰洛特","利维亚"));
        hashSet.add(new Role("叶奈法","范格堡"));
        hashSet.add(new Role("皮卡丘","华农兄弟家"));
        hashSet.add(new Role("杰尼龟","查干湖"));
        hashSet.add(new Role("杰洛特","利维亚"));
        hashSet.add(new Role("叶奈法","范格堡"));
        hashSet.add(new Role("皮卡丘","华农兄弟家"));
        hashSet.add(new Role("杰尼龟","查干湖"));
        System.out.println("==================================");
        System.out.println(hashSet);
        System.out.println("==================================");
        for(Role r : hashSet){
            System.out.println(r);
        }

    }
}
