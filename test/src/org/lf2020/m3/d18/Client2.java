package org.lf2020.m3.d18;

import java.io.*;
import java.net.Socket;

/**
 * @ClassName: Client2
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/3/18 18:19
 */
public class Client2 {
    public static void main(String[] args) throws IOException {
        //创建Socket对象
        Socket socket =new Socket("192.168.2.219",10005);
        //获取键盘录入
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //包装Socket的输出流
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        //键盘录入数据，输入exit结束
        while(true){
            String message = br.readLine();
            if(message.equalsIgnoreCase("exit")){
                System.out.println("退出输入");
                break;
            }
            bw.write(message);
            bw.newLine();
            bw.flush();
        }
        //释放资源
        socket.close();
    }

}
