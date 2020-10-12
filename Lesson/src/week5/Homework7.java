package week5;

import java.util.*;

class Homework7 {
    public static void main(String[] args) {
        String correct_pw = "hyin";
        String input_pw;

        Scanner scan = new Scanner(System.in);

        // 코드를 작성하세요.
        int i = 1;
        int j = 3;

        while (i <= j) {
            System.out.println("암호를 입력하세요.");
            input_pw = scan.nextLine();
            if (input_pw.equals(correct_pw)) {
                System.out.println("환영합니다.");
                break;
            } else {
                System.out.println("암호가 틀립니다.");
                if (i == j) {
                    System.out.println("접속을 거부합니다.");
                }
            }

            i++;
        }

    }
}