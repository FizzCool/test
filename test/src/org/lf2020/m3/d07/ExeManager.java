package org.lf2020.m3.d07;

import java.io.IOException;

/**
 * @ClassName: ExeManager
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/3/9 14:06
 */
public class ExeManager {
    private String Path = "D:\\Michelin\\EDI\\Job2\\test\\test.bat";
    private ErrorManager error;
    private  InfoManager info;
    private Runtime rt =Runtime.getRuntime();
    public void run() throws IOException {
        Process p =rt.exec(Path);
        error=new ErrorManager(p);
        info = new InfoManager(p);
//        error.setDaemon(true);
//        info.setDaemon(true);
        error.start();
        info.start();
        if(error.isError()){
            System.exit(0);
        }

    }

}
