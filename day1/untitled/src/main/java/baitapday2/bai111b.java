package baitapday2;

import java.util.Scanner;

public class bai111b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("nhap do cao h= ");
        int h = in.nextInt();
        for (int i=1;i<=h;i++){
            for (int j=1;j<=h;j++){
                if (j==i||j==1||i==h){
                    System.out.printf("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
