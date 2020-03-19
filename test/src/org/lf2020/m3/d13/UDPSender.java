package org.lf2020.m3.d13;

import java.io.IOException;
import java.net.*;

/**
 * @ClassName: UDPSender
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/3/18 17:31
 */
public class UDPSender {
    public static void main(String[] args) throws IOException {
        //1.创建DatagramSocket
        DatagramSocket ds = new DatagramSocket();
        //2.创建数据包DatagramPacket并初始化数据、数据长度、InetAddress、端口号
        InetAddress ip = InetAddress.getByName("192.168.2.219");
        byte[] bytes = "Hello".getBytes();
        int len = bytes.length;
        DatagramPacket dp = new DatagramPacket(bytes, len, ip, 10010);
        //3.发送数据包
        ds.send(dp);
        //4.释放资源
        ds.close();
    }
}
