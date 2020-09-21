package week2;

import java.util.Random;

public class Homework1 {
    public static void main(String[] args) {

        // Random 객체 생성
        Random rand = new Random();

        // 전화번호 첫 번째 숫자를 0으로 만든다.
        String pnumber = "0";
        // 전화번호 두번째 숫자는 2이상 6미만의 정수로 만든다.
        pnumber += rand.nextInt(4) + 2;
        pnumber += rand.nextInt(5) + 1;
        pnumber += "-";

        for (int i = 1; i <= 3; i++) {
            pnumber += rand.nextInt(9);
        }

        pnumber += "-";

        for (int j = 1; j <= 4; j++) {
            pnumber += rand.nextInt(9);
        }

        // 여기에 코드를 삽입하세요.
        System.out.println(pnumber);
    }
}
