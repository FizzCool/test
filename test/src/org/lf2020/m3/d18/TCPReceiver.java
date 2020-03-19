package org.lf2020.m3.d18;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ClassName: TCPReceiver
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/3/18 10:14
 */
public class TCPReceiver {
    public static void main(String[] args) throws IOException {
        //创建接收端的Socket对象
        ServerSocket ss = new ServerSocket(10001);

        //监听客户端连接，返回一个Socket对象
        Socket socket =ss.accept();
        //获取输入流，进行处理操作
        InputStream is = socket.getInputStream();
//        byte[] bytes = new byte[1024];
//        int len = is.read(bytes);
//        System.out.println(new String(bytes,0,len));
        int ch;
        while((ch=is.read())!=-1) {
            System.out.println((char) ch);
        }
        //建立输出流，发送反馈
        OutputStream os=socket.getOutputStream();
        os.write("hai".getBytes());
        //释放资源
        socket.close();
    }
}
