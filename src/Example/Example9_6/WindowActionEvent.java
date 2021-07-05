package Example.Example9_6;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class WindowActionEvent extends JFrame {
    JTextField text;
    ActionListener listener;        //listener是监视器
    public WindowActionEvent(){
        setLayout(new FlowLayout());
        text = new JTextField(10);
        add(text);
        listener = new ReaderListen();      //创造监视器
        text.addActionListener(listener);   //text将listener注册为自己的监视器
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
