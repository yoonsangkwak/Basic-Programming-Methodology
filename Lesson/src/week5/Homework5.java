package week5;

import java.util.Scanner;
class Homework5 {
    public static void main(String[] args) {
        int n;

        System.out.print("Please enter an integer:");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();

        // 여기에 코드를 입력하세요
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    System.out.println("(" + i + "," + j + ")");
                }
            }
        }

    }
}