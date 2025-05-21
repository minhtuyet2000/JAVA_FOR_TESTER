package Baitap.baitapJAVA;

import java.util.Scanner;

public class Capdo1_BT1 {
    public static void main(String[] args) {
        String chuoidauvao, chuoidaura = "";
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap vao chuoi can xoa nguyen am (a, e, y, i, o, u): ");
        chuoidauvao = scan.nextLine();
        for (int i=0; i<chuoidauvao.length(); i++) {
            char b = chuoidauvao.charAt(i);
            if (b == 'a' || b == 'e' || b == 'i' || b == 'o' || b == 'u' || b == 'A' || b == 'E' || b == 'I' || b == 'O' || b == 'U' || b == 'y' || b == 'Y') {
            } else {
                chuoidaura+=b;
            }
        }
        System.out.println("\nChuoi da xoa nguyen am: " + chuoidaura);
    }
}
