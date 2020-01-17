package org.lf2019.lf1231;

import java.util.LinkedList;

/**
 * @ClassName: Stack
 * @Description: 链表模拟栈
 * @Author: 梁飞
 * @Date: 2019/12/31
 */
public class Stack {
    private LinkedList list;

    public Stack() {
        this.list = new LinkedList();
    }

    public void add(Object o){
        list.addFirst(o);
    }

    public Object get(){
        return list.removeFirst();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }


}
