package org.lf2020.m3.d07;

import java.io.*;

/**
 * @ClassName: ErrorManager
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/3/9 14:23
 */
public class ErrorManager extends Thread{
    private Process p;
    private StringBuilder errorMessage =new StringBuilder("");

    public ErrorManager(Process p) {
        this.p = p;
    }

    @Override
    public void run() {
            InputStream is = p.getErrorStream();
            InputStreamReader isr = null;
            try {
                isr = new InputStreamReader(is, "GBK");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            BufferedReader br = new BufferedReader(isr);
            String len;

            try {

                    while ((len = br.readLine()) != null) {
                        System.out.println("ERROR:" + len);
                        errorMessage.append(len);
                    }
            } catch (IOException e) {
                e.printStackTrace();
            }finally{
                try {
                    is.close();
                    isr.close();
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
    }
    public boolean isError(){
        return !errorMessage.toString().equals("");
    }
}
