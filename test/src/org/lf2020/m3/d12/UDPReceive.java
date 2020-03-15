package org.lf2020.m3.d12;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @ClassName: UDPReceive
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/3/12 12:13
 */
public class UDPReceive {
    public static void main(String[] args) throws IOException {
        //创建DatagramSocket对象
        DatagramSocket ds = new DatagramSocket(10010);
        //创建接收数据的DatagramPacket包
        byte[] bytes=new byte[1024];
        int length =bytes.length;
        DatagramPacket dp = new DatagramPacket(bytes,length);
        //接收数据
        ds.receive(dp);
        InetAddress address = dp.getAddress();
        String ip = address.getHostAddress();
        byte[] bytes1 = dp.getData();
        int len = bytes1.length;
        String message = new String(bytes1,0,len);
        System.out.println(ip+"地址的主机发来消息:"+message);
        //获取数据并处理
        ds.close();
        //释放资源
    }
}
