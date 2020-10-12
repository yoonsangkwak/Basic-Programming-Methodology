package week5;

// 두 수 사이의 수
import java.util.*;

class Homework6 {
    public static void main(String[] args) {
        int num1, num2, i, j;
        System.out.println("input :");
        Scanner scan = new Scanner(System.in);
        // 입력받기
        num1 = scan.nextInt();
        num2 = scan.nextInt();

        i = Math.min(num1, num2);
        j = Math.max(num1, num2);

        // 코드를 작성하세요.
        for (int k = i; k <= j; k++) {
            if (k == j) {
                System.out.print(k);
            } else {
                System.out.print(k + " ");
            }
        }
    }
}