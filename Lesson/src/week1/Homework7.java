package week1;

import java.util.*;
import java.text.*;

public class Homework7 {
    public static void main(String[] args) {
        final double PI = 3.14; // 원주율
        double r; // 구의 반지름
        double v; // 구의 부피

        // 코드를 작성하세요.
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        r = a;
        v = ((double) 4 / 3) * PI * Math.pow(r, 3);

        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println(df.format(v));
    }
}
