package Baitap.baitapJAVA;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Capdo3_BT3 {
    public static void main(String[] args) {
        String s, t;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.print("Nhap vao chuoi s: ");
            s = scan.nextLine();
            System.out.print("Nhap vao chuoi t: ");
            t = scan.nextLine();
            if (s.length() < t.length()) {
                System.out.println("Vui long nhap lai");
            }
        } while (s.length() < t.length());

        Map<Character, Integer> slgkitu_t = new HashMap<>();
        for (char c : t.toCharArray()) {
            slgkitu_t.put(c, slgkitu_t.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> slgkitu_xetduyet = new HashMap<>();
        int trai = 0, phai = 0;
        int kituhople = 0;
        int vitribatdau = 0;
        int chuoinhonhat = Integer.MAX_VALUE;

        while (phai < s.length()) {
            char c = s.charAt(phai);
            phai++;
            if (slgkitu_t.containsKey(c)) {
                slgkitu_xetduyet.put(c, slgkitu_xetduyet.getOrDefault(c, 0) + 1);
                if (slgkitu_xetduyet.get(c).equals(slgkitu_t.get(c))) {
                    kituhople++;
                }
            }
            while (kituhople == slgkitu_t.size()) {
                if (phai - trai < chuoinhonhat) {
                    vitribatdau = trai;
                    chuoinhonhat = phai - trai;
                }
                char d = s.charAt(trai);
                trai++;
                if (slgkitu_t.containsKey(d)) {
                    if (slgkitu_xetduyet.get(d).equals(slgkitu_t.get(d))) {
                        kituhople--;
                    }
                    slgkitu_xetduyet.put(d, slgkitu_xetduyet.get(d) - 1);
                }
            }
        }
        System.out.println("Chuỗi con nhỏ nhất của s chứa tất cả các ký tự trong t: " + s.substring(vitribatdau, vitribatdau + chuoinhonhat));
    }
}
