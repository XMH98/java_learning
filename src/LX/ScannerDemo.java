package LX;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        double sum=0;
        int m=0;
        while(reader.hasNextDouble()){
            m++;
            sum+=reader.nextDouble();
        }
        System.out.println(m+"个数的和为"+sum);
        System.out.println(m+"个数的平均值为"+(sum/m));
    }
}
