package baitap;

import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("nhap chieu dai chieu rong");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double cv = 2*(a+b);
        double dt = a*b;
        System.out.printf("chu vi hinh chu nhat: %.2f",cv);
        System.out.printf("dien tich hinh chu nhat: %.2f", dt);
    }
}
