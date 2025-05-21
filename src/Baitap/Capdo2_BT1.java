package Baitap.baitapJAVA;

import java.util.Scanner;

public class Capdo2_BT1 {
    public static void main(String[] args) {
        int songuoiphuthuoc;
        double thunhapnam, thunhapchiuthue=0, mucthue, sothue;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("\nThu nhap nam la: ");
            thunhapnam = scan.nextDouble();
            System.out.print("So nguoi phu thuoc: ");
            songuoiphuthuoc = scan.nextInt();
            if (thunhapnam > 0 && songuoiphuthuoc >= 0) {
                thunhapchiuthue = thunhapnam - 4000000 - songuoiphuthuoc * 1600000;
                if (thunhapchiuthue <= 0) {
                    System.out.println("Thu nhap chiu thue khong hop le\nVui long nhap lai");
                }
            } else {
                System.out.println("Vui long nhap lai");
            }
        } while (thunhapnam <= 0 || songuoiphuthuoc < 0 || thunhapchiuthue <= 0);
        if (thunhapchiuthue <= 5000000) {
            mucthue = 0.05;
        } else if (thunhapchiuthue <= 10000000) {
            mucthue = 0.1;
        } else if (thunhapchiuthue <= 18000000) {
            mucthue = 0.15;
        } else if (thunhapchiuthue <= 32000000) {
            mucthue = 0.2;
        } else if (thunhapchiuthue <= 52000000) {
            mucthue = 0.25;
        } else if (thunhapchiuthue <= 80000000) {
            mucthue = 0.3;
        } else {
            mucthue = 0.35;
        }
        sothue = mucthue*thunhapchiuthue;
        int sothuephaitra = (int)sothue;
        System.out.println("So thue phai tra la: " + sothuephaitra);
    }
}
