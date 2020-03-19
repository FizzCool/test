package org.lf2020.m3.d18;

import java.io.*;
import java.net.Socket;

/**
 * @ClassName: Client3
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/3/18 18:52
 */
public class Client3 {
    public static void main(String[] args) throws IOException {
        //创建Socket
        Socket socket = new Socket("192.168.2.219",10007);
        //创建一个输入流
        BufferedReader br =new BufferedReader(new FileReader("D:\\Project\\test\\test\\src\\org\\lf2020\\m3\\d18\\网络编程-02"));
        //包装Socket的输出流
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        String line;
        while((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        socket.shutdownOutput();
        //接收反馈
        BufferedReader sbr = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println(sbr.readLine());

        //释放资源
        br.close();
        socket.close();

    }
}
