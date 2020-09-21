package week2;

import java.util.*;

public class Homework6 {
    public static void main(String[] args) {

        // 코드를 작성하세요.
        int a[] = new int[6];
        Random r = new Random();

        for (int i = 0; i <= 5; i++) {
            a[i] = r.nextInt(45)+1;

            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    i--;
                }
            }
        }

        for (int k = 0; k <= 5; k++) {
            if (k == 5) {
                System.out.print(a[k]);
            } else {
                System.out.print(a[k]+" ");
            }
        }
    }
}
