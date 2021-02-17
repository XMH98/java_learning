package LX;

import java.lang.Math.*;
import java.util.Random;

public class RandomDemo {
    public static void main(String args[]){
        Random r1 = new Random();
        int t1 = r1.nextInt(30);
        System.out.println(r1);
        System.out.println(t1);
        System.out.println(Math.random());
    }
}
