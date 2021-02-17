package test;

import java.util.*;

public class test1_1 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int a[] = new int[number];
        Scanner reader = new Scanner(System.in);
        for(int i=0;i<number;i++){
            a[i] = reader.nextInt();
        }
        int size=0;
        System.out.print(a[size]+" ");
        for(int i=1;i<number;i++){
            if(a[i] != a[size]){
                a[++size] = a[i];
                System.out.print(a[size]+" ");
            }
        }
    }
}
