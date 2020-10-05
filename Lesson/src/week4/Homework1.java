package week4;

import java.util.Scanner;
class Homework1 {
    public static void main(String[] args) {
        double grade; // 평점

        // 토익 점수를 저장하는 변수를 선언한다
        int toeic;

        // Scanner 객체를 생성하고 scan이 가리키게 한다
        Scanner scan = new Scanner(System.in);

        //평점을 입력 받는다
        System.out.print("grade:");
        grade = scan.nextDouble();

        // 토익 점수를 입력 받는다
        System.out.print("TOEIC score:");
        toeic = scan.nextInt();


        // 평점과 토익 점수에 따라 적절한 메시지를 출력한다
        if (grade >= 4.0 & toeic >= 700) {
            System.out.println("A");
        } else if (grade >= 3.5 & toeic >= 700) {
            System.out.println("B");
        } else if (grade >= 3.0 & toeic >= 700) {
            System.out.println("C");
        } else if (grade < 3.0 | toeic < 700) {
            System.out.println("D");
        }
    }
}