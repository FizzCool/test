package org.lf2020.m3.d12;

import java.io.IOException;
import java.net.*;

/**
 * @ClassName: UDPSend
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/3/12 12:04
 */
public class UDPSend {
    public static void main(String[] args) throws IOException {
        //创建DatagramSocket对象
        DatagramSocket ds = new DatagramSocket();
        //创建数据包,包括数据,数据长度,ip,端口号
        byte[] bytes = "Hello Java World".getBytes();
        int length = bytes.length;
        InetAddress address = InetAddress.getByName("192.168.2.219");
        DatagramPacket dp = new DatagramPacket(bytes,length,address,10010);
        //发送数据
        ds.send(dp);
        //释放资源
        ds.close();
    }

}
