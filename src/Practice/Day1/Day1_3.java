package Practice.Day1;
//实现猜数字游戏，在[0-10]之间，使用Random和Scanner
import java.util.Random;
import java.util.Scanner;

public class Day1_3 {
    public static void main(String[] args) {
        boolean over=true;
        Random rand = new Random();
        int num = rand.nextInt(10);
        Scanner scan = new Scanner(System.in);
        int guess = scan.nextInt();
        while(over){
            if(guess==num){
                System.out.println("You Win!");
                over=false;
            }
            else{
                System.out.println("You Lose!");
                guess = scan.nextInt();
            }
        }
    }
}
