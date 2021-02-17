package Exercise;
//编写应用程序求1!+2!+...+10!
public class Exercise3_1 {
    public static void main(String[] args) {
        int n = 10,sum = 0;
        for(int i = 1;i <= n;i++){
            sum = sum+i;
        }
        System.out.println("1!+2!+...+10!="+sum);
    }
}
