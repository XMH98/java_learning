package Practice.Day5;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Pool extends JPanel implements MouseListener, MouseMotionListener{
    BufferedImage bg;
    int score = 0;
    Fish[] fishes;
    Fish2[] fishes2;
    Net net;

    int power=1;

    int times= 0;


    //记录最高分
    int MaxScore = 0;
    BufferedReader br;
    {
        try {
            br = new BufferedReader(new FileReader("src/Practice/Day5/Score.txt"));
            //一次读取一行数据
            String strScore = br.readLine();
            MaxScore = Integer.parseInt(strScore);
            br.close();//关闭流对象

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Pool(){
        //注册监听
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        net = new Net();
        try {
            bg = ImageIO.read(new File("src/Practice/Day5/imgs/bg.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        //创建鱼数组
        fishes = new Fish[22];
        //对数组进行初始化
        for(int i = 0; i < 9; i++){
            fishes[i] = new Fish("fish0" + (i + 1));
            fishes[i + 9] = new Fish("fish0" + (i + 1));
        }
        fishes[18] = new Fish("fish13");
        fishes[19] = new Fish("fish13");
        fishes[20] = new Fish("fish14");
        fishes[21] = new Fish("fish14");

        //创建鱼数组
        fishes2 = new Fish2[22];
        //对数组进行初始化
        for(int i = 0; i < 9; i++){
            fishes2[i] = new Fish2("fish0" + (i + 1));
            fishes2[i + 9] = new Fish2("fish0" + (i + 1));
        }
        fishes2[18] = new Fish2("fish13");
        fishes2[19] = new Fish2("fish13");
        fishes2[20] = new Fish2("fish14");
        fishes2[21] = new Fish2("fish14");
    }

    public void start(){
        for(int i = 0; i < fishes.length; i++){
            new Thread(fishes[i]).start();
            new Thread(fishes2[i]).start();
        }
        while(true){
            repaint();
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(bg, 0, 0, null);

        //绘制分数
        g.setColor(Color.WHITE);
        g.setFont(new Font("宋体", Font.BOLD, 18));
        g.drawString("分数: " + score, 30, 30);
        g.drawString("历史最高分: " + MaxScore, 150, 30);

        //绘制次数
        g.drawString("点击次数: " +times, 350, 30);

        //改变渔网位置
        g.drawString("Power:"+power,650,20);
        g.setColor(Color.red);
        g.drawString(" 点击右键改变火力值", 605, 40);

        //绘制鱼
        for(int i = 0; i < fishes.length; i++){
            Fish f = fishes[i];
            g.drawImage(f.currentFishPic, f.x, f.y, null);
        }

        for(int i = 0; i < fishes2.length; i++){
            Fish2 f = fishes2[i];
            g.drawImage(f.currentFishPic, f.x, f.y, null);
        }

        if(net.show){
            g.drawImage(net.netImg, net.x, net.y, null);
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        //获得是鼠标坐标
        int x = e.getX();
        int y = e.getY();

        net.moveTo(x - net.width/2, y - net.height/2);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

        //改变渔网大小
        int m=e.getModifiers();
        if(m==16) {

        }
        if(m==4) {
            changepower();
        }

        times++;

        for(int i = 0; i < fishes.length; i++){
            if(net.catchFish(fishes[i])){
                fishes[i].disappear();//鱼消失
                score = score + fishes[i].width/10;
            }
        }

        for(int i = 0; i < fishes2.length; i++){
            if(net.catchFish2(fishes2[i])){
                fishes2[i].disappear();//鱼消失
                score = score + fishes2[i].width/10;
            }
        }
        //比较两个分数
        if(score> MaxScore){
            //将最高分替换成currentScore
            BufferedWriter bw = null;
            try {
                bw = new BufferedWriter(new FileWriter("src/Practice/Day5/Score.txt"));
                bw.write(score + "");
                bw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        //刷新最高分
        try {
            br = new BufferedReader(new FileReader("src/Practice/Day5/Score.txt"));
            //一次读取一行数据
            String strScore = br.readLine();
            MaxScore = Integer.parseInt(strScore);
            br.close();//关闭流对象

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    //改变渔网大小
    protected void changepower() {
        power++;
        if(power>9) {
            power=1;
        }
        net.change(power);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        net.show = true;
    }

    @Override
    public void mouseExited(MouseEvent e) {
        net.show = false;
    }

    public int getScore(){
        return score;
    }




}