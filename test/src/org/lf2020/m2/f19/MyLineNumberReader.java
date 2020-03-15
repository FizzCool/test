package org.lf2020.m2.f19;

import java.io.IOException;
import java.io.Reader;

/**
 * @ClassName: MyLineNumberReader
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/2/19 12:21
 */
public class MyLineNumberReader {
    private Reader r;
    int lineNumber=0;
    public MyLineNumberReader(Reader reader){
        this.r=reader;
    }
    public String readLine() throws IOException {
        ++lineNumber;
        int ch;
        StringBuilder sb = new StringBuilder();
        while((ch=r.read())!=-1){
            if(ch=='\r')
                continue;
            if(ch=='\n'){
                return sb.toString();
            }else{
                sb.append((char)ch);
            }
        }
        if(sb.length()>0){
            return sb.toString();
        }
        return null;

    }

    public void close() throws IOException {
        r.close();
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }
}
