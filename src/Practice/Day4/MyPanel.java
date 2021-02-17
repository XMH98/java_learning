package Practice.Day4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Arrays;

/*
 * JPanel对象就是事件源
 * 鼠标事件
 *
 */
public class MyPanel extends JPanel implements MouseListener, MouseMotionListener {
    //定义属性，分别表示起始点坐标和结束点坐标
    //int x1, y1;
    //int x2, y2;
    int[] x1 = new int[1];
    int[] y1 = new int[1];
    int[] x2 = new int[1];
    int[] y2 = new int[1];
    int index=1;

    public MyPanel(){
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    public void paint(Graphics g){
        super.paint(g);//绘制一张白纸

        for(int i = 0;i<index;i++){
            g.drawLine(x1[i],y1[i],x2[i],y2[i]);
        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        //获得起始点坐标
        x1[index-1] = e.getX();
        y1[index-1] = e.getY();

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //获得结束点坐标
        x2[index-1] = e.getX();
        y2[index-1] = e.getY();
        index++;
        x1 = Arrays.copyOf(x1,index);
        y1 = Arrays.copyOf(y1,index);
        x2 = Arrays.copyOf(x2,index);
        y2 = Arrays.copyOf(y2,index);
        //重新绘制
        repaint();

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        //在拖拽过程中，随时绘制临时直线
        x2[index-1] = e.getX();
        y2[index-1] = e.getY();
        repaint();

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        //获取鼠标位置

    }
}
