package Baitap.baitapJAVA;

import java.util.Arrays;
import java.util.Scanner;

public class Capdo1_BT4 {
    public static void main(String[] args) {
        String chuoidauvao = "";
        int tongsotu=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap vao chuoi can dem so tu: ");
        chuoidauvao = scan.nextLine();
        String mangdauvao[] = chuoidauvao.split(" ");
        for (int i=0;i<=mangdauvao.length;i++) {
            tongsotu=i;
        }
        System.out.println("Tong so tu trong chuoi la: " + tongsotu);
    }
}
