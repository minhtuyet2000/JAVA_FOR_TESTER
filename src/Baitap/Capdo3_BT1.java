package Baitap.baitapJAVA;

import java.util.Arrays;
import java.util.Scanner;

public class Capdo3_BT1 {
    static int sophantu, target;
    static int[] mang, capindex;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("\nVui long nhap so phan tu: ");
            sophantu = scan.nextInt();
            System.out.print("Vui long nhap target: ");
            target = scan.nextInt();
            if (sophantu <= 0|| target <= 0) {
                System.out.println("Ban phai nhap so lon hon khong");
            }
        } while (sophantu <= 0|| target <= 0);
        mang = new int[sophantu];
        nhapphantu(scan, mang);
        capindex = chisoindex(mang, target);
        if (capindex[0] != -1&&capindex[1] != -1) {
            System.out.println("Chỉ số cần tìm: [" + capindex[0] + ", " + capindex[1] + "]");
        } else {
            System.out.println("Khong co cap gia tri thoa dieu kien target");
        }
    }

    public static void nhapphantu(Scanner scan, int[] mang) {
        for (int i = 0; i < mang.length; i++) {
            System.out.print("Phan tu thu " + (i + 1));
            System.out.print("\nGia tri la: ");
            mang[i] = scan.nextInt();
        }
        Arrays.sort(mang);
        System.out.println("Cac phan tu trong mang " + Arrays.toString(mang));
    }
    public static int[] chisoindex(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[] {i + 1, j + 1};
                }
            }
        }
        return new int[] {-1, -1};
    }
}

