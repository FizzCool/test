package org.lf2020.m3.d18;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @ClassName: Client
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/3/18 11:33
 */
public class Client {
    public static void main(String[] args) throws IOException {
        //1.创建Socket对象
        Socket socket = new Socket("192.168.2.219",10007);
        //2.获取输出流，写入数据
        OutputStream os =socket.getOutputStream();
        os.write("Hello Server".getBytes());
        //3.接收返回信息（可选操作）
        InputStream is = socket.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        System.out.println(new String(bys,0,len));
        //4.释放资源
        socket.close();
    }
}
