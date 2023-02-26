package baitap;

import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //input
        System.out.println("nhap tien phong: ");
        int a = in.nextInt();
        System.out.println("nhap so dien thang truoc va thang nay");
        int b = in.nextInt();
        int c = in.nextInt();
        if (b>c){
            System.exit(0);
        }
        System.out.println("nhap so nuoc thang truoc va thang nay");
        int d = in.nextInt();
        int e = in.nextInt();
        if (d>e){
            System.exit(0);
        }
        System.out.println("so tien dich vu khac");
        int f = in.nextInt();
        //tinhtoan
        //tiendiennuoc
        int td= (c-b)*4;
        int tc = (e-d)*30;
        //tongtien
        int tong = a+tc+td+f;
        System.out.println("tong tien phong: "+ tong);



    }
}
