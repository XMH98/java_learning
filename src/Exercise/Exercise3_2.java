package Exercise;
//编写一个应用程序求100以内的全部素数
public class Exercise3_2 {
    public static void main(String[] args) {
        int n = 100;                                    //本方法会漏一个“2是素数”
        for(int i = 2;i <= n;i++){
            for(int j = 2;j < i;j++){
                if(i%j == 0)
                    break;
                if(j == i-1)
                    System.out.println(i + "是素数");
            }
        }
        /*int i, j, k;
        for (i = 2; i < 100; i++) {
            k = (int) Math.sqrt(i);
            for (j = 2; j <= k; j++) {
                if (i % j == 0)
                    break;
            }
            if (j > k) {
                System.out.println(i + "是素数");
            }
        }*/
    }
}

