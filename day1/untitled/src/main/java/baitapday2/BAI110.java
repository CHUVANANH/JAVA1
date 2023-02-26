package baitapday2;

import java.util.Scanner;

public class BAI110 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c=0;
        int socach = 0;
        for (a=0;a<=200;a++)
            for (b=0;b<=100;b++)
                for (c=0;c<=40;c++)
                    if ((a*100+b*2000+c*5000)==200000){
                        socach++;
                    }
        System.out.println("so cach "+ socach);
    }
}
