package Baitap.baitapJAVA;

import java.util.Scanner;

public class Capdo3_BT2 {
    public static void main(String[] args) {
        String chuoidauvao, chuoicon, chuoidaura="";
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap vao mot chuoi: ");
        chuoidauvao = scan.nextLine();
        for (int i=0; i<chuoidauvao.length(); i++) {
            for (int j=i+1; j<=chuoidauvao.length(); j++) {
                chuoicon = chuoidauvao.substring(i,j);
                if (kiemtradoixung(chuoicon)==true && chuoicon.length()>chuoidaura.length()) {
                    chuoidaura = chuoicon;
                }
            }
        }
        System.out.println("Chuoi con doi xung dai nhat la: " + chuoidaura);
    }
    public static boolean kiemtradoixung(String s) {
        int trai=0, phai=s.length()-1;
        while (trai<phai) {
            if (s.charAt(trai) != s.charAt(phai)) {
                return false;
            }
            trai++;
            phai--;
        }
        return true;
    }
}
