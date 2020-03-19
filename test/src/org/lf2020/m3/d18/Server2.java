package org.lf2020.m3.d18;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ClassName: Server2
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/3/18 18:29
 */
public class Server2 {
    public static void main(String[] args) throws IOException {
        //创建ServerSocket
        ServerSocket serverSocket = new ServerSocket(10005);
        //监听客户端，获取Socket对象
        Socket socket = serverSocket.accept();
        //包装Socket的输入流,并处理数据
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new FileWriter("Server.txt"));
        String line = null;
        while((line=br.readLine())!=null){
            System.out.println(line);
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        //释放资源
        socket.close();
        bw.close();
    }
}
