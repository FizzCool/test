package org.lf2020.m2.f19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

/**
 * @ClassName: MyLineNumberReader2
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/2/19 12:38
 */
public class MyLineNumberReader2 extends BufferedReader {
    int LineNumber=0;
    public MyLineNumberReader2(Reader in) {
        super(in);
    }
    @Override
    public String readLine() throws IOException {
        LineNumber++;
        return super.readLine();
    }

    public int getLineNumber() {
        return LineNumber;
    }

    public void setLineNumber(int lineNumber) {
        LineNumber = lineNumber;
    }
}
