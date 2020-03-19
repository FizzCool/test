package org.lf2020.m3.d18;

import java.io.*;
import java.net.Socket;

/**
 * @ClassName: TCPSender
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/3/18 10:08
 */
public class TCPSender {
    public static void main(String[] args) throws IOException {
        //创建发送端的Socket对象
        Socket socket = new Socket("192.168.2.219",10001);
        //获取输出流，写数据
        OutputStream os = socket.getOutputStream();
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String message = br.readLine();
        os.write("hello".getBytes());
        //接收反馈
        InputStream is = socket.getInputStream();
        int ch;
        while((ch=is.read())!=-1){
            System.out.print((char)ch);
        }
        //释放资源
        socket.close();
    }
}
