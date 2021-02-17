package Practice.Day3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame  {
    JButton btn1 = new JButton("红色");
    JButton btn2 = new JButton("绿色");
    JButton btn3 = new JButton("蓝色");

    public MyFrame(String title) {
        JPanel pan = new JPanel();
        JPanel show = new JPanel();
        pan.add(btn1);
        pan.add(btn2);
        pan.add(btn3);
        this.add(pan,"North");
        this.add(show,"Center");

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                show.setBackground(Color.RED);
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                show.setBackground(Color.GREEN);
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                show.setBackground(Color.BLUE);
            }
        });

        this.setSize(600, 480);
        this.setTitle(title);
        this.setLocationRelativeTo((Component)null);
        this.setDefaultCloseOperation(3);
        this.setResizable(false);
        this.setVisible(true);
    }
}