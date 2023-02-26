package baitapday2;

import java.awt.*;
import java.util.Scanner;

public class bai111 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("nhap do cao h: ");
        int h = in.nextInt();
        if (h<=0){
            System.out.println("so cao phai lon hon 0");
            System.exit(0);
        }
        for (int i=1;i<=h;i++){
            for (int j=1;j<=h;j++){
                System.out.print("");
            }
            for (int j=1;j<=2*i-1;j++){
            System.out.printf("*");
        }
            System.out.println("");
        }
    }
}
