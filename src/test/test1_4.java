package test;

import java.util.*;

public class test1_4 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int i,j;
        int a[][] = new int[number][number];
        int b[] =new int[number];
        int k=0,x=0,y;
        for(i=0;i<number;i++){
            for(j=0;j<number;j++){
                a[i][j] = scanner.nextInt();
                b[j] += a[i][j];
            }
        }
        for(j=0;j<number;j++){
            if(b[j]<0) {
                b[j] = -b[j];
                k++;
            }
        }
        if(k%2==0){
            for(j=0;j<number;j++){
                x += b[j];
            }
            System.out.print(x);
        }
        else{
            for(j=1;j<number;j++){
                if(b[0]>b[j]){
                    y=b[0];
                    b[0]=b[j];
                    b[j]=y;
                }
            }
            b[0] = -b[0];
            for(j=0;j<number;j++){
                x += b[j];
            }
            System.out.print(x);
        }
    }
}
