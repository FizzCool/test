package org.lf2020.m2.f19;

import java.io.IOException;
import java.io.Reader;

/**
 * @ClassName: MyBufferedReader
 * @Description: 自定义字节输入流
 * @Author: 梁飞
 * @Date: 2020/2/19 11:57
 */
public class MyBufferedReader {
    private Reader r;
    public MyBufferedReader(Reader reader){
        this.r=reader;
    }
    public String readLine() throws IOException {
        int ch;
        StringBuilder sb=new StringBuilder();
        while((ch=this.r.read())!=-1){

            if(ch=='\r')
                continue;
            if(ch=='\n'){
                return sb.toString();
            }
            else{
                sb.append((char)ch);
            }
        }
        if(sb.length()>0){
            return sb.toString();
        }
        return null;
    }
    public void close() throws IOException {
        this.r.close();
    }
}
