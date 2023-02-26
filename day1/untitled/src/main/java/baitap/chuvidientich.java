package baitap;

import java.util.Scanner;

public class chuvidientich {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("nhap 3 canh a b c cua tam giac");
        double a= in.nextDouble();
        double b= in.nextDouble();
        double c= in.nextDouble();
        if (a<b+c && b<a+c && c<a+b){
            double cv = a+b+c;
            double p  = cv / 2;
            double dt = Math.sqrt(p*(p-a)*p*(p-b)*p*(p-c));
            System.out.println("chu vi tam giac: "+ cv);
            System.out.printf("dien tich tam giac:%.2f ", dt);
        }
        else {
            System.out.println("gia tri a b c ko tao ra tam giac");
        }
    }
}
