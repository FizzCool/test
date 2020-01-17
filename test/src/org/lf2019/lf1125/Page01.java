package org.lf2019.lf1125;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName: Page01
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2019/11/25
 */
public class Page01 {
    public static void main(String[] args) {
        ImageIcon i = new ImageIcon("01.jpg");
        Image image = i.getImage();

        Frame frame = new Frame("界面测试");
        frame.setVisible(true);
        frame.setLocation(30,30);
        frame.setSize(250,300);
        frame.setIconImage(image);
    }

}
