package org.lf2020.m3.d06;

import java.awt.*;
import java.awt.event.*;

/**
 * @ClassName: UIDemo2
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/3/6 16:50
 */
public class UIDemo2 {
    public static void main(String[] args) {
        Frame f = new Frame("test");
        f.setBounds(400,200,400,300);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.setLayout(new FlowLayout());
        Button RedButton = new Button("RedButton");
        Button GreenButton = new Button("GreenButton");
        Button BlueButton = new Button("BlueButton");
        Button WhiteButton = new Button("WhiteButton");
        RedButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                f.setBackground(Color.blue);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                f.setBackground(Color.green);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                f.setBackground(Color.yellow);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                f.setBackground(Color.white);
            }
        });
        GreenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setBackground(Color.green);
            }
        });
        BlueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setBackground(Color.blue);
            }
        });
        WhiteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setBackground(Color.white);
            }
        });
        f.add(RedButton);
        f.add(GreenButton);
        f.add(BlueButton);
        f.add(WhiteButton);
        f.setVisible(true);
    }
}
