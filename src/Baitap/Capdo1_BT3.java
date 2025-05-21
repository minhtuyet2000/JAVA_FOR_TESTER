package Baitap.baitapJAVA;

import java.util.Scanner;

public class Capdo1_BT3 {
    public static void main(String[] args) {
        int n, tong=0;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Nhap so nguyen duong n: ");
            n = scan.nextInt();
            if (n > 0) {
                for (int i = 0; i <= n; i += 2) {
                    tong += i;
                }
                System.out.println("Tổng Các Số Chẵn: " + tong);
            } else {
                System.out.println("Vui long nhap lai");
            }
        } while (n<=0);
    }
}
