package Practice.Day2;

//  七位数彩票
//	描述：七位数彩票，每一位数都是0-9之间的数。七位数数字可重复，中奖考虑到顺序的。
//	step1- 用户购买彩票：
//			Scanner， 用户输入七位数，每一位数都是0-9，然后将七位数保存在数组中。
//			考虑到用户输入的数不在[0-9]，需要让用户重新输入。
//			8 1 0 4 1 2 8
//	step2- 开奖中心开奖：Random   随机生成[0-9]之间的数
//			机器随机生成中奖号码。用一个数组存放。
//			5 1 2 4 1 2 8
//	step3- 兑奖
//			人购买的彩票与机器生成的兑奖彩票进行比较。两个数组进行比较

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Day2_3 {
    public static void main(String[] args) {
        //1-购买彩票
        int[] buyLottery = new int[7];
        Scanner scan = new Scanner(System.in);

        //用户输入7次购买彩票的数值
        int index = 0;
        while(index<7){
            System.out.println("请输入第"+(index+1)+"位彩票，范围在【1-9】:");
            int num = scan.nextInt();
            if(num<0||num>9){
                System.out.println("您输入的第"+(index+1)+"彩票号"+num+"不合法，请重新输入：");
                continue;
            }
            //输入正确
            buyLottery[index]=num;
            index++;
        }

        //2-开奖
        Random rand = new Random();
        int[] hitLottery = new int[7];
        for(int i = 0;i<7;i++){
            hitLottery[i]=rand.nextInt(10);
        }

        //3-兑奖
        System.out.println("购买彩票号："+Arrays.toString(buyLottery));
        System.out.println("中奖彩票号："+Arrays.toString(hitLottery));
        boolean flag=true;
        for(int i = 0;i<7;i++){
            if(buyLottery[i]!=hitLottery[i]){
                flag=false;
                break;
            }
        }

        if(flag){
            System.out.println("恭喜您，中了500万...");
        }
        else{
            System.out.println("很遗憾，继续努力...");
        }
    }
}
