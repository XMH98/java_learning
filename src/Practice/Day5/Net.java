package Practice.Day5;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Net {
    int x, y;
    int width, height;
    BufferedImage netImg;
    boolean show;

    public Net(){
        try {
            netImg = ImageIO.read(new File("src/Practice/Day5/imgs/net09.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        show = false;
        x = 0;
        y = 0;
        width = netImg.getWidth();
        height = netImg.getHeight();
    }

    public void moveTo(int x, int y){
        this.x = x;
        this.y = y;
    }

    public boolean catchFish(Fish f){

        //通过渔网图片左上角坐标，得到鼠标坐标
        int mouseX = x + width/2;
        int mouseY = y + height/2;
        int fishCenterX = f.x + f.width/2;
        int fishCenterY = f.y + f.height/2;

        int dx = Math.abs(mouseX - fishCenterX);
        int dy = Math.abs(mouseY - fishCenterY);
        int distance = (int)Math.sqrt(dx*dx + dy*dy);

        return distance <= width/2;
    }

    public boolean catchFish2(Fish2 f){

        //通过渔网图片左上角坐标，得到鼠标坐标
        int mouseX = x + width/2;
        int mouseY = y + height/2;
        int fishCenterX = f.x + f.width/2;
        int fishCenterY = f.y + f.height/2;

        int dx = Math.abs(mouseX - fishCenterX);
        int dy = Math.abs(mouseY - fishCenterY);
        int distance = (int)Math.sqrt(dx*dx + dy*dy);

        return distance <= width/2;
    }

    //改变渔网大小
    public void change(int power) {
        // TODO Auto-generated method stub
        try {
            netImg = ImageIO.read(new File("src/Practice/Day5/imgs/net0/"+power+".png"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        width = netImg.getWidth();
        height = netImg.getHeight();
    }
}