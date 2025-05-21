package Baitap.baitapJAVA;

import java.util.Arrays;
import java.util.Scanner;

public class Capdo2_BT3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi: ");
        String chuoidauvao = scan.nextLine();
        String chuoidaura = "";
        for (int i = 0; i < chuoidauvao.length(); i++) {
            char a = chuoidauvao.charAt(i);
            if (chuoidaura.indexOf(a) == -1) {
                chuoidaura += a;
            }
        }
        System.out.println("Chuỗi sau khi xóa ký tự lặp lại: " + chuoidaura);
    }
}
