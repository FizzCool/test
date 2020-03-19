package org.lf2020.m3.d18;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ClassName: Server4
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/3/18 20:06
 */
public class Server4 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10007);
        while(true){
            Socket socket = serverSocket.accept();
            new Thread(new UserThread(socket)).run();
        }
    }
}
