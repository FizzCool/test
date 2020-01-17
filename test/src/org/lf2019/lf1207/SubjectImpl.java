package org.lf2019.lf1207;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName: SubjectImpl
 * @Description: 主题实现类
 * @Author: 梁飞
 * @Date: 2019/12/7
 */
public class SubjectImpl implements  Subject{

    public String msg;

    private List<Observe> observes= new ArrayList<Observe>();

    @Override
    public void start() {
        while(true){
            System.out.println("请输入字符串数据，退出请输入-1：");
            Scanner sc = new Scanner(System.in);
            String msg = sc.nextLine();
            if(msg.equals(null) || msg.trim().equals("") ){
                System.out.println("数据为空，再次尝试连接...");
            }
            else if(msg.trim().equals("-1")){
                shutdown();
                break;
            }
            else{
                for (Observe observe : observes) {
                    observe.update(msg);
                }
            }
        }
    }

    @Override
    public void shutdown() {
        System.out.println("程序结束...再会。");
    }

    @Override
    public void registObserve(Observe observe) {
        observes.add(observe);
    }

    @Override
    public void removeObserve(Observe observe) {
        int index = observes.indexOf(observe);
        if(index>0){
            observes.remove(index);
        }
    }

    @Override
    public void notifyObserve() {
        for (Observe observe : observes) {
            observe.update(msg);
        }

    }

    public void setMsg(String msg) {
        this.msg = msg;
        notifyObserve();
    }
}
