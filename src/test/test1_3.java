package test;

import java.util.*;

public class test1_3 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int x = 0;
        for(int i=2;i<=N;i++) {
            int b = i;
            while (b != 1) {
                if (b % 2 != 0) {
                    b = b * 3 + 1;
                    if (b > x) {
                        x = b;
                    }
                }
                else {
                    b = b / 2;
                }
            }
        }
        System.out.print(x);
    }
}
