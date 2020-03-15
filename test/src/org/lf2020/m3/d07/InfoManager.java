package org.lf2020.m3.d07;

import java.io.*;

/**
 * @ClassName: InfoManager
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/3/9 14:15
 */
public class InfoManager extends Thread{
    private Process p;

    public InfoManager(Process p) {
        this.p = p;
    }

    @Override
    public void run() {
            String len;
            BufferedReader br =null;
            try {
                br = new BufferedReader(new InputStreamReader(p.getInputStream(), "GBK"));
                while ((len = br.readLine()) != null)
                    System.out.println("INFO:" + len);
            } catch (IOException e) {
                e.printStackTrace();
            }finally{
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

}
