package Practice.Day1;
//  打印出100-1000范围内的所有水仙花数。所谓水仙花数是指一个3位数，其各位数字立方和等于该数本身。
//	例如 153    提示：先取出每位的值
//	1*1*1 + 5*5*5 + 3*3*3 = 153
//	xyz   -->   x,  y, z   使用/  和      %
//	x*x*x + y*y*y + z*z*z = xyz
public class Day1_1 {
    public static void main(String[] args) {
        int a,b,c;
        int num;
        for(num=100;num<1000;num++){
            a=num/100;
            b=(num-a*100)/10;
            c=num%10;
            if(num==a*a*a+b*b*b+c*c*c){
                System.out.println(num);
            }
        }
    }
}
