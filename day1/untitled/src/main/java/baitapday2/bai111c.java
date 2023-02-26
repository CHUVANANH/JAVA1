package baitapday2;

import java.util.Scanner;

public class bai111c {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("nhap h= ");
        int h = in.nextInt();
        int i, j;
        for (i=1;i<=h;i++){
            for (j=1;j<=h-i;j++){
                System.out.print(" ");
            }
            for (j=1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
}
