package org.lf2020.m3.d11;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @ClassName: InetAddressDemo1
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/3/11 17:47
 */
public class InetAddressDemo1 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address =InetAddress.getByName("USER-D9LB6UMFLO");
        String name = address.getHostName();
        String ip =address.getHostAddress();
        System.out.println(name+"----"+ip);
    }
}
