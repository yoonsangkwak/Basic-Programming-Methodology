package week2;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        String str = "";  // 입력받는 문자열
        String outputStr = ""; //출력 문자열
        Scanner scan = new Scanner(System.in);
        str = scan.next(); // 문자열 입력받기
        // 여기에 코드를 입력하세요.

        for (int i = str.length() - 1; i >= 0; i--) {
            outputStr += str.charAt(i);
        }
        System.out.println(outputStr);
    }
}
