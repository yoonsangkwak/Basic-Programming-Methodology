package week1;

import java.util.*;

public class Homework5 {
    public static void main(String[] args) {
        double py;  // 평 면적
        double sqmt; // 제곱 미터 면적

        // 코드를 작성하세요.
        Scanner scan = new Scanner(System.in);
        System.out.print("면적 (평): ");
        double x = scan.nextDouble();

        py = x;

        sqmt = 3.305785 * py;

        System.out.println(sqmt);
    }
}
