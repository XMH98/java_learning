package Shu.Shu9_1;

import java.awt.*;
import javax.swing.event.*;
import javax.swing.*;

public class Shu9_1 {
    public static void main(String args[]){
            Computer fr = new Computer();
    }
}

class Computer extends JFrame implements DocumentListener{
    JTextArea text1,text2;
    int cout=1;
    double sum=0,aver=0;
    Computer(){
        setLayout(new FlowLayout());
        text1=new JTextArea(6,20);
        text2=new JTextArea(6,20);
        add(new JScrollPane(text1));
        add(new JScrollPane(text2));
        text2.setEditable(false);
        (text1.getDocument()).addDocumentListener(this);
        setSize(300,320);
        setVisible(true);
        validate();
        setVisible(true);
        validate();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public void changeUpdate(DocumentEvent e){
        String s=text1.getText();
        String [] a=s.split("[^0123456789.]+");
        sum=0;
        aver=0;
        for(int i=0;i<a.length;i++){
            try{
                sum=sum+Double.parseDouble(a[i]);
            }
            catch (Exception ee){}
        }
        aver=sum/cout;
        text2.setText(null);
        text2.append("\n和:"+sum);
        text2.append("\n平均值:"+aver);
    }
    public void removeUpdate(DocumentEvent e){
        changeUpdate(e);
    }

    @Override
    public void changedUpdate(DocumentEvent e) {

    }

    public void insertUpdate(DocumentEvent e){
        changeUpdate(e);
    }
}
