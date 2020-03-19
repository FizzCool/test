package org.lf2020.m3.d18;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ClassName: Server
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/3/18 11:36
 */
public class Server {
    public static void main(String[] args) throws IOException {
        //1.创建ServerSocket对象
        ServerSocket serverSocket = new ServerSocket(10002);
        //2.监听客户端连接，返回一个Socket对象
        Socket socket = serverSocket.accept();
        //3.获取输入流，处理接收到的数据
        InputStream is = socket.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        System.out.println(new String(bys,0,len));
        //4.获取输出流，写入返回信息
        OutputStream os = socket.getOutputStream();
        os.write("Received".getBytes());
        //5.释放资源
        socket.close();
    }
}
