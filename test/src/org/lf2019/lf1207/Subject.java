package org.lf2019.lf1207;

/**
 * 主题接口
 */
public interface Subject {
    //注册监听者
    public void registObserve(Observe observe);
    //移除监听者
    public void removeObserve(Observe observe);
    //通知监听者
    public void notifyObserve();

    public void start();

    public void shutdown();
}
