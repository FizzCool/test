package org.lf2020.m3.d18;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ClassName: Server3
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/3/18 19:00
 */
public class Server3 {
    public static void main(String[] args) throws IOException {
        //创建ServerSocket
        ServerSocket serverSocket = new ServerSocket(10006);
        //监听客户端，返回Socket对象
        Socket socket = serverSocket.accept();
        //包装Socket的输入流
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        //创建一个输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("Server.txt"));
        //数据处理
        String line;
        while((line=br.readLine())!=null){
            System.out.println(line);
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        //发送反馈
        BufferedWriter sbw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        sbw.write("文件上传成功");
        sbw.flush();

        //释放资源
        bw.close();
        socket.close();
    }
}
