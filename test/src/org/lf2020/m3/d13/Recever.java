package org.lf2020.m3.d13;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @ClassName: Recever
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/3/13 12:21
 */
public class Recever {
    public static void main(String[] args) throws IOException {
       //创建DatagramSocket对象并初始化端口号
        DatagramSocket datagramSocket = new DatagramSocket(10010);
        while(true){
            //创建接收数据的包
            byte[] bytes = new byte[1024];
            DatagramPacket datagramPacket = new DatagramPacket(bytes,bytes.length);
            //获取数据并处理
            datagramSocket.receive(datagramPacket);
            String ip= datagramPacket.getAddress().getHostAddress();
            String message = new String(datagramPacket.getData(),0,datagramPacket.getLength());
            System.out.println(ip+":"+message);
        }
        //释放资源
//        datagramSocket.close();
    }
}
