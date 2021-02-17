package JCDGXT;

import java.awt.*;
import javax.swing.*;

public class Caigou extends JFrame {
    JTextField jTextField1,jTextField2,jTextField3,jTextField4;     //文本框
    JLabel jLabel1,jLabel2,jLabel3,jLabel4,jLabel5;                       //名字
    JPanel jp1,jp2,jp3,jp4,jp5,jp6;                                 //框架
    JButton jb1,jb2;                                                    //按钮
    public Caigou() {
        jTextField1 = new JTextField(13);
        jTextField2 = new JTextField(13);
        jTextField3 = new JTextField(12);
        jTextField4 = new JTextField(13);
        jLabel5 = new JLabel("采购系统");
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18));
        jLabel1 = new JLabel("书名");
        jLabel2 = new JLabel("作者");
        jLabel3 = new JLabel("出版商");
        jLabel4 = new JLabel("数量");
        jb1 = new JButton("确认");
        jb2 = new JButton("取消");
        jp1 = new JPanel();
        jp2 = new JPanel();
        jp3 = new JPanel();
        jp4 = new JPanel();
        jp5 = new JPanel();
        jp6 = new JPanel();

        this.setLayout(new GridLayout(6, 1));

        jp6.add(jLabel5);

        jp1.add(jLabel1);
        jp1.add(jTextField1);

        jp2.add(jLabel2);
        jp2.add(jTextField2);

        jp3.add(jLabel3);
        jp3.add(jTextField3);

        jp4.add(jLabel4);
        jp4.add(jTextField4);

        jp5.add(jb1);
        jp5.add(jb2);

        this.add(jp6);
        this.add(jp1);
        this.add(jp2);
        this.add(jp3);
        this.add(jp4);
        this.add(jp5);

        this.setBounds(600, 300, 310, 260);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setTitle("采购系统");
    }
    public static void main(String args[]){new Caigou();}
}
