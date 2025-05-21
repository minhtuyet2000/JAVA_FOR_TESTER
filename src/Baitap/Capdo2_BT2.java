package Baitap.baitapJAVA;

import java.util.Scanner;

public class Capdo2_BT2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String chuoidauvao, chuoia="";
        System.out.print("Nhap vao mot chuoi: ");
        chuoidauvao =scan.nextLine();
        for (int i = (chuoidauvao.length()-1); i>=0; i--) {
            char a = chuoidauvao.charAt(i);
            chuoia += a;
        }
        if (chuoia.equals(chuoidauvao) == true) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
