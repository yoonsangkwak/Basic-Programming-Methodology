package week4;

import java.util.*;

class Homework6 {
    public static void main(String[] args) {
        int input_month; // 입력받은 정수를 저장하는 변수
        String monthString; // 문자열 형태의 달을 저장하는 변수

        Scanner scan = new Scanner(System.in);
        input_month = scan.nextInt();

        // 입력받은 정수형태의 달(월)을 Switch 문을 이용해 문자열로 전환
        // 1~12 외의 경우 "Invalid Month" 출력
        // 코드를 작성하세요.
        switch (input_month) {
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            case 3 :
                monthString = "March";
                break;
            case 4 :
                monthString = "April";
                break;
            case 5 :
                monthString = "May";
                break;
            case 6 :
                monthString = "June";
                break;
            case 7 :
                monthString = "July";
                break;
            case 8 :
                monthString = "August";
                break;
            case 9 :
                monthString = "September";
                break;
            case 10 :
                monthString = "October";
                break;
            case 11 :
                monthString = "November";
                break;
            case 12 :
                monthString = "December";
                break;
            default :
                monthString = "Invalid Month";
        }

        System.out.println(monthString);
    }
}