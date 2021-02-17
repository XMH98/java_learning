package test;

import java.util.*;
public class test1_5 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[5];
        for(int i = 0;i<5;i++){
            a[i] = scanner.nextInt();
        }
        for(int i = 0;i<5;i++){
            System.out.print(a[i]+" ");
        }
    }
}
