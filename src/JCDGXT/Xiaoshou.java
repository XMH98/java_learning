package JCDGXT;

import java.awt.*;
import javax.swing.*;

public class Xiaoshou extends JFrame {
    JTextField jTextField1,jTextField2,jTextField3,jTextField4,jTextField5;     //文本框
    JLabel jLabel1,jLabel2,jLabel3,jLabel4,jLabel5,jLabel6;                       //名字
    JPanel jp1,jp2,jp3,jp4,jp5,jp6,jp7;                                 //框架
    JButton jb1,jb2;                                                    //按钮
    public Xiaoshou(){
        jTextField1 = new JTextField(13);
        jTextField2 = new JTextField(13);
        jTextField3 = new JTextField(12);
        jTextField4 = new JTextField(13);
        jTextField5 = new JTextField(11);
        jLabel6 = new JLabel("销售系统");
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18));
        jLabel1 = new JLabel("书名");
        jLabel2 = new JLabel("作者");
        jLabel3 = new JLabel("出版商");
        jLabel4 = new JLabel("数量");
        jLabel5 = new JLabel("订购结果");
        jb1 = new JButton("确认");
        jb2 = new JButton("取消");
        jp1 = new JPanel();
        jp2 = new JPanel();
        jp3 = new JPanel();
        jp4 = new JPanel();
        jp5 = new JPanel();
        jp6 = new JPanel();
        jp7 = new JPanel();

        this.setLayout(new GridLayout(7,1));

        jp6.add(jLabel6);

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

        jp7.add(jLabel5);
        jp7.add(jTextField5);

        this.add(jp6);
        this.add(jp1);
        this.add(jp2);
        this.add(jp3);
        this.add(jp4);
        this.add(jp5);
        this.add(jp7);

        this.setBounds(600,300,310,260);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setTitle("销售系统");
    }
    public static void main(String args[]){new Xiaoshou();}
}
