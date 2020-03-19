package org.lf2020.m3.d18;

import java.io.*;
import java.net.Socket;

/**
 * @ClassName: UserThread
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/3/18 20:03
 */
public class UserThread implements Runnable{
    private Socket socket;

    public UserThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try{
            InputStream is = socket.getInputStream();
            byte[] bys = new byte[1024];
            int len = is.read(bys);
            System.out.println(new String(bys,0,len));
            //4.获取输出流，写入返回信息
            OutputStream os = socket.getOutputStream();
            os.write("Received".getBytes());
            //5.释放资源
            socket.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
