package week2;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        int total;  // 총 시간 (초)
        int days = 0, hours = 0, minutes = 0, seconds = 0; // 일,시간,분,초

        Scanner scan = new Scanner(System.in);
        total = scan.nextInt();

        // 여기에 코드를 입력하세요.
        days = total / 60 / 60 / 24;
        hours = total / 60 / 60 % 24;
        minutes = total / 60 % 60;
        seconds = total % 60;

        System.out.println("Total(seconds):");
        System.out.println(days + "Days " + hours + "Hours " + minutes + "Minutes " + seconds + "Seconds");
    }
}
