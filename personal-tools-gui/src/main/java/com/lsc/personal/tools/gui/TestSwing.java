package com.lsc.personal.tools.gui;

import javax.swing.*;
import java.awt.*;

/**
 * @Description:
 * @Author: lisc
 * @date: 2023/6/23
 */
public class TestSwing {

    public static void main(String[] agrs)
    {
        JFrame frame=new JFrame("Java第三个GUI程序");    //创建Frame窗口
        frame.setSize(400,200);
        frame.setLayout(new BorderLayout());    //为Frame窗口设置布局为BorderLayout\


        JButton button1=new JButton ("上");
        JButton button2=new JButton("左");
        JButton button3=new JButton("中");
        JButton button4=new JButton("右");
        JButton button5=new JButton("下");
        JPanel jPanel1 = new JPanel();

        JPanel jPanel5 = new JPanel();

        jPanel1.add(button1);
        jPanel1.add(new JButton("左"));
        jPanel1.add(new JButton("左"));
        jPanel1.add(new JButton("左"));
        jPanel1.add(new JButton("左"));
        jPanel1.add(new JButton("左"));
        jPanel1.add(new JButton("左"));
        jPanel5.add( new JScrollPane(new JTextArea(8,20)));
        jPanel5.add( new JTextArea(8,20));

        frame.add(jPanel1,BorderLayout.NORTH);

        frame.add(jPanel5,BorderLayout.SOUTH);
        frame.setBounds(300,200,600,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
