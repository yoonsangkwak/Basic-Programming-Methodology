package week4;

import java.util.Scanner;
class Homework2 {
    public static void main(String[] args) {
        int totalcreditearned; // 총 이수학점
        // 토익 점수를 저장하는 변수를 선언한다
        //여기에 코드를 삽입하세요
        int toeic;

        // Scanner 객체를 생성하고 scan이 가리키게 한다
        Scanner scan = new Scanner(System.in);

        System.out.print("total credit:");
        // 여기에 코드를 삽입하세요
        totalcreditearned = scan.nextInt();
        System.out.print("TOEIC score:");
        // 여기에 코드를 삽입하세요
        toeic = scan.nextInt();

        // 총 이수학점과 TOEIC 점수에 따라 졸업/수료/졸업불가 여부를 출력한다
        // 여기에 코드를 삽입하세요
        if (totalcreditearned >= 140 & toeic >= 700) {
            System.out.println("graduation");
        } else if (totalcreditearned >= 140 & toeic < 700) {
            System.out.println("completion");
        } else if (totalcreditearned < 140) {
            System.out.println("failure");
        }
    }
}