package Practice.Day2;

//  双色球
//	描述：
//		六个红球，1个篮球
//		六个红球取值范围[1-33], 1个篮球[1-16]
//		六个红球如果某个数字已经占用，则后面不能再使用了.1-33数字不能重复
//		兑奖时，六个红球没有顺序之分。  5, 7, 2, 3, 1, 9;    9, 1, 2, 5, 7, 3
//		兑奖时，对六个红球进行排序Arrays.sort();  copyof

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Day2_4 {
    public static void main(String[] args) {
        int[] buyLotteryR = new int[6];
        int[] buyLotteryB= new int[1];
        Scanner scan = new Scanner(System.in);

        //红球号码输入
        int index=0;
        while(index<6){
            System.out.println("请输入红球第"+(index+1)+"位数，范围在【1-33】，每个数只能输一次：");
            int num = scan.nextInt();
            if(num<1||num>33){
                System.out.println((num)+"超出范围，请重新输入");
                continue;
            }
            buyLotteryR[index]=num;
            for(int i=0;i<index;i++){
                if(buyLotteryR[i]==num){
                    System.out.println(num+"您已输入过一次，请重新输入：");
                    index--;
                    continue;
                }
            }
            index++;
        }

        //蓝球号码输入
        System.out.println("请输入蓝球号码：");
        while(true){
            int num = scan.nextInt();
            if(num<1||num>16){
                System.out.println(num+"超出范围，请重新输入");
                continue;
            }
            else{
                buyLotteryB[0]=num;
                break;
            }
        }

        //开奖
        int[] hitLotteryR = new int[6];
        int[] hitLotteryB = new int[1];
        Random rand = new Random();
        index=0;
        while(index<6){
            hitLotteryR[index] = rand.nextInt(33);
            for(int i =0;i<index;i++){
                if(hitLotteryR[i]==hitLotteryR[index]){
                    index--;
                    continue;
                }
            }
            index++;
        }
        hitLotteryB[0]=rand.nextInt(16);

        //排序
        Arrays.sort(buyLotteryR);
        Arrays.sort(hitLotteryR);

        //输出号码
        System.out.println("您的号码："+Arrays.toString(buyLotteryR)+buyLotteryB[0]);
        System.out.println("中奖号码："+Arrays.toString(hitLotteryR)+hitLotteryB[0]);

        //判断是否中奖
        boolean flag = true;
        for(int i = 0;i<6;i++){
            if(buyLotteryR[i]!=hitLotteryR[i]){
                flag=false;
                break;
            }
            if(buyLotteryB[0]!=hitLotteryB[0]){
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("恭喜您中了500万");
        }
        else {
            System.out.println("请继续努力");
        }
    }
}
