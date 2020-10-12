package week5;

import java.util.Scanner;
class Homework2 {
    public static void main(String[] args) {
        int grade;			    // 한 학생의 접수
        int numStudents=0;	//학생들의 수
        int numPass=0;	  	// 통과 학생들의 수
        int numFail = 0;	  // 낙제 학생들의 수

        Scanner scan = new Scanner (System.in);

        System.out.print("Enter the first score(negative to exit)");
        grade = scan.nextInt();

        // 점수가 음수가 아닌 동안 다음을 반복한다
        while (grade >=0) {

            // 학생들의 수를 1만큼 증가시킨다
            // 여기에 코드를 삽입하세요
            numStudents += 1;

            // 점수가 60이상이면 통과 학생들의 수를 1만큼 증가시키고
            // 아니먼 낙제 학생들의 수를 1만큼 증가시킨다
            // 여기에 코드를 삽입하세요
            if (grade >= 60) {
                numPass += 1;
            } else {
                numFail += 1;
            }

            // 다음 점수를 읽어 들인다
            // 여기에 코드를 삽입하세요
            System.out.print("Enter the next score(negative to exit)");
            grade = scan.nextInt();
            if (grade == -1) {
                break;
            }
        }
        // 통과 학생들의 수와 낙제 학생들의 수를 출력한다
        // 여기에 코드를 삽입하세요
        System.out.println("numStudents:" + numStudents);
        System.out.println("numPass:" + numPass);
        System.out.println("numFail:" + numFail);
    }
}