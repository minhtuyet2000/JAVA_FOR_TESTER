package Baitap.baitapJAVA;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Capdo1_BT2 {
    static int sophantu, solonnhat, solonthuhai;
    static int[] mang;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("\nVui long nhap so phan tu: ");
            sophantu = scan.nextInt();
            if (sophantu <= 0 ) {
                System.out.println("Ban phai nhap so lon hon khong");
            }
        } while (sophantu<=0);
            mang = new int[sophantu];
            nhapphantu(scan, mang);
    }
    public static void nhapphantu(Scanner scan, int[] mang) {
        for (int i=0; i<mang.length;i++) {
            System.out.print("Phan tu thu " + (i + 1));
            System.out.print("\nGia tri la: ");
            mang[i] = scan.nextInt();
        }
        if (mang.length == 1) {
            System.out.println(Integer.MIN_VALUE);
        } else {
            System.out.println("Cac phan tu trong mang " + Arrays.toString(mang));
            gtrilonthu2(mang);
        }
    }
    public static void gtrilonthu2 (int[] mang) {
        solonnhat = Integer.MIN_VALUE;
        solonthuhai = Integer.MIN_VALUE;
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] > solonnhat) {
                solonthuhai = solonnhat;
                solonnhat = mang[i];
            } else if (mang[i] > solonthuhai && mang[i] != solonnhat) {
                solonthuhai = mang[i];
            }
        }
        if (solonthuhai == Integer.MIN_VALUE) {
            System.out.println("Tất cả phần tử giống nhau");
        } else {
            System.out.println("Giá Trị Lớn Thứ Hai Trong Mảng: " + solonthuhai);
        }
    }
}



