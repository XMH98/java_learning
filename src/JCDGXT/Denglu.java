package JCDGXT;

import javax.swing.*;
import java.awt.*;   //导入必要的包

public class Denglu extends JFrame{
    JTextField jTextField ;             //定义文本框组件
    JPasswordField jPasswordField;      //定义密码框组件
    JLabel jLabel1,jLabel2,jLabel3;
    JPanel jp1,jp2,jp3,jp4;
    JButton jb1,jb2;                //创建按钮
    public Denglu(){
        jTextField = new JTextField(12);
        jPasswordField = new JPasswordField(13);
        jLabel1 = new JLabel("用户名");
        jLabel2 = new JLabel("密码");
        jLabel3 = new JLabel("登录");
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24));
        jb1 = new JButton("确认");
        jb2 = new JButton("取消");
        jp1 = new JPanel();
        jp2 = new JPanel();
        jp3 = new JPanel();
        jp4 = new JPanel();

        //设置布局
        this.setLayout(new GridLayout(4,1));

        jp4.add(jLabel3);

        jp1.add(jLabel1);
        jp1.add(jTextField);//第一块面板添加用户名和文本框

        jp2.add(jLabel2);
        jp2.add(jPasswordField);//第二块面板添加密码和密码输入框

        jp3.add(jb1);
        jp3.add(jb2); //第三块面板添加确认和取消

        this.add(jp4);
        this.add(jp1);
        this.add(jp2);
        this.add(jp3);  //将三块面板添加到登陆框上面
        //设置显示
        this.setBounds(600,300,310,260);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setTitle("教材订购系统");
    }
    public static void main(String[] args){
        new Denglu();
    }
}
