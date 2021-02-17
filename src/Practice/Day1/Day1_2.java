package Practice.Day1;
//打印输出1-1000之间可以同时被3、5、7整除的数
public class Day1_2 {
    public static void main(String[] args) {
        for(int i=1;i<1000;i++){
            if((i%3==0)&&(i%5==0)&&(i%7==0)){
                System.out.println(i);
            }
        }
    }
}
