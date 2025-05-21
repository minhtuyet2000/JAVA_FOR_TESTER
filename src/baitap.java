import java.util.ArrayList;
import java.util.List;

public class baitap {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        for (int i=0; i <= 50; i++) {
            if (i % 11 == 0) {
                number.add(i);
            }
        }
        System.out.println(number);
        int max = number.get(0);
        for (int m = 1; m < number.size(); m++) {
            if (number.get(m) > max) {
                max = number.get(m);
            }
        }
        System.out.println(max);
        int min = number.get(0);
        for (int n = 1; n < number.size(); n++) {
            if (number.get(n) < min) {
                min = number.get(n);
            }
        }
        System.out.println(min);
    }
}
