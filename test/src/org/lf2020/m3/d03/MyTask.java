package org.lf2020.m3.d03;

import java.io.File;
import java.util.TimerTask;

/**
 * @ClassName: MyTask
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/3/3 14:58
 */
public class MyTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("嘭!!!");
        deleteFolder(new File("D:\\log"));
    }
    public void deleteFolder(File src){
        if(src.isDirectory()){
            File[] files = src.listFiles();
            for(File f:files){
                deleteFolder(f);
                f.delete();
            }
        }
        else{
            src.delete();
        }
        src.delete();
    }
}
