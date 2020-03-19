package org.lf2020.m3.d13;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @ClassName: UDPReceiver
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/3/18 17:43
 */
public class UDPReceiver {
    public static void main(String[] args) throws IOException {
        //1.创建DatagramSocket对象
        DatagramSocket ds = new DatagramSocket(10010);
        //2.创建接收数据的数据包
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
        //3.接收数据并处理
        ds.receive(dp);
        String ip = dp.getAddress().getHostAddress();//获取发送端的ip
        String message = new String(dp.getData(), 0, dp.getLength());//获取数据
        System.out.println(ip + ":" + message);
        //4.释放资源
        ds.close();


    }
}
