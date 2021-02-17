package Practice.Day5;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Fish implements Runnable{
    //属性
    int x, y;
    int width, height;
    BufferedImage[] allFishPics;
    BufferedImage currentFishPic;
    int index = 0;
    int speed;
    Random rand = new Random();

    public Fish(String name){//fish01,fish02...
        allFishPics = new BufferedImage[10];
        //加载对应鱼类型的十张图片
        for(int i = 0; i < 10; i++){
            try {
                allFishPics[i] = ImageIO.read(new File("src/Practice/Day5/imgs/" + name + "_0" + i + ".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //绘制当前图片
        currentFishPic = allFishPics[0];
        width = currentFishPic.getWidth();
        height = currentFishPic.getHeight();

        //随机产生鱼的坐标，保证鱼一开始都出现在池塘中
        x = rand.nextInt(800 - width);
        y = rand.nextInt(480 - height);

        //每条鱼游动速度不一样。
        speed = rand.nextInt(10) + 2;
    }

    //鱼消失方法，游出池塘或被捕获到
    public void disappear(){
        x = 800;
        y = rand.nextInt(480 - height);
        speed = rand.nextInt(10) + 2;
    }

    public void move(){
        //每游动一次，切换当前绘制的图片
        currentFishPic = allFishPics[index++ % 10];
        x = x - speed;
        if(x < -width||x>800){//鱼游出池塘
            disappear();
        }
    }

    @Override
    public void run() {
        while(true){
            move();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }



}
