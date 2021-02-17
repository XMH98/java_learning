package Practice.Day2;

//  人机猜拳
//	"石头，剪刀，布" --> "布 > 石头 -> 剪刀  -> 布"
//	每次游戏，人机对战玩三次。
//
//	人：Scanner
//		step1- 根据提示，人从键盘输入一个值"石头 0 ", "剪刀 1", "布 2"
//		step2- 用户输入后，得到用户出的是什么，然后再与机器自动生成的进行比较，看谁赢，提示谁赢。
//	机器：Random
//		step1- String[] str = {"石头", "剪刀", "布"};
//		step2- 让机器随机生成一个值，该值的范围应该[0~str.length]

import java.util.Random;
import java.util.Scanner;

public class Day2_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int guess;

        //输入石头0，剪刀1，布2
        while(true){
            System.out.println("请出石头0，剪刀1，布2：");
            guess = scan.nextInt();
            if(guess<0||guess>2){
                System.out.println("请重新输入");
                continue;
            }
            else {
                break;
            }
        }

        //电脑随机石头，剪刀，布
        String[] rot = {"石头","剪刀","布"};
        Random rand = new Random();
        int rob = rand.nextInt(3);
        System.out.println("您出"+rot[guess]+"对手出"+rot[rob]);

        //判断输赢
        if(guess-rob==0){
            System.out.println("平手");
        }
        else if(guess-rob==-1||guess-rob==2){
            System.out.println("赢了");
        }
        else{
            System.out.println("输了");
        }
    }
}
