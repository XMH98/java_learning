package test;

import java.util.*;

public class test1_2 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        double Max = Math.sqrt(5000000);
        for(int a1 = 0;a1 < Max;a1++){
            for(int a2 = a1;a2 < Max;a2++){
                for(int a3 = a2;a3 < Max;a3++){
                    int a4 = (int)Math.sqrt(number-a1*a1+a2*a2+a3*a3);
                    if(a1*a1+a2*a2+a3*a3+a4*a4 == number){
                        System.out.print(a1+" "+a2+" "+a3+" "+a4);
                        return;
                    }
                }
            }
        }
    }
}
