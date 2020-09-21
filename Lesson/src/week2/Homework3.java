package week2;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        String inputStr; // 입력 문자열
        String outputStr = ""; // 출력 문자열
        Scanner scan = new Scanner(System.in);
        // 여기에 코드를 입력하세요
        // 힌트: String 클래스의 replace 함수 사용
        inputStr = scan.nextLine();
        outputStr = inputStr.replace("가을", "봄");
        System.out.println(outputStr);
    }
}
