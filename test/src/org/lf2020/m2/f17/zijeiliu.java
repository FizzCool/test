package org.lf2020.m2.f17;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @ClassName: zijeiliu
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/2/17 11:26
 */
public class zijeiliu {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("1.txt"));
        osw.write(97);
        char[] chars = {'1','s','6'};
        osw.write(chars);
        osw.write(chars,0,3);
        osw.write("中国");
        osw.write("中国我爱你",2,3);
//        osw.flush();
        osw.close();
    }
}
