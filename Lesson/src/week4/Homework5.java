package week4;

import java.util.*;

class Homework5 {
    public static void main(String[] args) {
        // 입력받은 연도를 저장하는 변수
        int year;
        // 윤년인지 아닌지 저장하는 함수(true 면 윤년)
        boolean is_leap_year = false;
        System.out.println("연도를 입력하세요.");
        Scanner scan = new Scanner(System.in);

        year = scan.nextInt();

        // 입력받은 연도가 윤년인지 평년인지 계산해 기록한다.
        // 코드를 완성하세요.
        if (year % 400 == 0) {
            is_leap_year = true;
        } else if (year % 4 == 0 && year % 100 != 0) {
            is_leap_year = true;
        } else {
            is_leap_year = false;
        }

        // 윤년이면 "XXXX년은 윤년입니다." 출력
        // 평년이면 "XXXX년은 평년입니다." 출력
        // 코드를 완성하세요.
        if (is_leap_year == true) {
            System.out.println(year + "년은 윤년입니다.");
        } else {
            System.out.println(year + "년은 평년입니다.");
        }
    }
}