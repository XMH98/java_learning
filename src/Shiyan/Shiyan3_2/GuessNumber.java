package Shiyan.Shiyan3_2;
import java.util.Scanner;
import java.util.Random;
public class GuessNumber {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        Random random = new Random();
        System.out.println("给你一个1~100之间的整数，请猜测这个数");        //random.nextInt(100)是[0,100)中的随机整数
        int realNumber = random.nextInt(100)+1;
        int yourGuess = 0;
        System.out.println("请输入你的猜测：");
        yourGuess = reader.nextInt();
        while(yourGuess != realNumber){                                 //循环条件
            if(yourGuess > realNumber){                                 //猜大了的条件
                System.out.println("猜大了，请再输入你的猜测：");
                yourGuess = reader.nextInt();
            }
            else if(yourGuess < realNumber){                            //猜小了的条件
                System.out.println("猜小了，请再输入你的猜测：");
                yourGuess = reader.nextInt();
            }
        }
        System.out.println("你猜对了！");
    }
}
