package week2;

import java.util.*;

public class Homework7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str;
        // 코드를 작성하세요.
        str = scan.nextLine();
        String[] date = str.split("/");
        String year = date[0];
        String month = date[1];
        String day = date[2];

        System.out.println(month + "/" + day + "/" + year);
    }
}
