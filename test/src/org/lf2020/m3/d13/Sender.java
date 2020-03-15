package org.lf2020.m3.d13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @ClassName: Sender
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/3/13 12:33
 */
public class Sender {
    public static void main(String[] args) throws IOException {
        //创建Socket对象
        DatagramSocket ds = new DatagramSocket();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while((s=br.readLine())!=null){
            if(s.equalsIgnoreCase("exit")){
                System.out.println("退出发送");
                break;
            }
            byte[] bytes = s.getBytes();

            DatagramPacket dp = new DatagramPacket(bytes,(int)bytes.length, InetAddress.getByName("192.168.2.219"),10010);
            //发送包
            ds.send(dp);
        }

        //创建package对象初始化信息,信息长度,ip,端口号

        //释放资源
        ds.close();
    }
}
