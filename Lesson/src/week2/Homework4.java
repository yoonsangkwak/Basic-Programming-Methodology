package week2;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        double r, h, volume = 0, area = 0;
        Scanner scan = new Scanner(System.in);

        // 여기에 코드를 입력하세요.

        // 사용자로부터 r 입력받기
        r = scan.nextDouble();
        // 사용자로부터 h 입력받기
        h = scan.nextDouble();

        // 힌트: Math.PI, Math.sqrt 사용
        volume = ((double) 1 / 3) * Math.PI * r * r * h;
        area = Math.PI * r * Math.sqrt(r * r + h * h) + Math.PI * r * r;

        System.out.println(volume);
        System.out.println(area);
    }
}
