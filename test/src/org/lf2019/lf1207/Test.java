package org.lf2019.lf1207;

/**
 * @ClassName: Test
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2019/12/8
 */
public class Test {
    public static void main(String[] args) {
        SubjectImpl consumer = new SubjectImpl();
        consumer.registObserve(new Observe() {
            @Override
            public void update(String msg) {
                System.out.println("当前信息为："+msg);
            }
        });
        consumer.start();
    }



}
