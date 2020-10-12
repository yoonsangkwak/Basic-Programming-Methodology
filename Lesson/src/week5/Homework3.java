package week5;

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.print("Please enter a sentence:");
        Scanner scan = new Scanner(System.in);
        String sentence;

        //여기에 코드를 입력하세요
        sentence = scan.nextLine();
        sentence = sentence.replaceAll(" ", "");
        int count = sentence.length();
        System.out.println(count);
    }
}