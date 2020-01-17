package org.lf2019.lf1207;

/**
 * @ClassName: ObserveImpl
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2019/12/7
 */
public class ObserveImpl implements Observe{
    private String name;

    private Subject subject;

    public ObserveImpl(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
        subject.registObserve(this);
    }

    @Override
    public void update(String msg) {

    }
}
