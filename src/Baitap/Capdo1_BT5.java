package Baitap.baitapJAVA;

import java.util.Scanner;

public class Capdo1_BT5 {
    public static void main(String[] args) {
        String chuoidauvao, chuoidaura = "";
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap vao chuoi can in chu cai dau tien moi tu: ");
        chuoidauvao = scan.nextLine();
        String mangdauvao[] = chuoidauvao.split(" ");
        for (int i=0; i<mangdauvao.length;i++) {
            char b = mangdauvao[i].charAt(0);
            chuoidaura += " " + b;
        }
        System.out.println("Chu cai dau tien moi tu " + chuoidaura.toUpperCase());
    }
}
