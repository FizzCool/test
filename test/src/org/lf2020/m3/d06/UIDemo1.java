package org.lf2020.m3.d06;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @ClassName: UIDemo1
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/3/6 15:38
 */
public class UIDemo1 {
    public static void main(String[] args) {
        Frame f = new Frame("测试");
        f.setBounds(400,200,400,300);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.setLayout(new FlowLayout());
        Button button1 = new Button("DataTransfer");
        TextField textField = new TextField(20);
        TextArea textArea = new TextArea(10,40);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s1 = textField.getText();
                textField.setText("");
                textArea.append(s1+"\n");
            }
        });
        f.add(textField);
        f.add(button1);
        f.add(textArea);
        f.setVisible(true);
    }
}
