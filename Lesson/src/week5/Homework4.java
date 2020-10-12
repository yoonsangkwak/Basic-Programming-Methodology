package week5;

import java.util.Scanner;
class Homework4 {
    public static void main(String[] args) {
        System.out.print("Please enter a sentence:");
        int a=0;
        int e=0;
        int i=0;
        int o=0;
        int u=0;
        int consonant=0;
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        // 공백 제거
        // 소문자 변환
        // 여기에 코드를 입력 하세요
        sentence = sentence.replaceAll(" ", "");
        sentence = sentence.toLowerCase();
        String [] sentenceArray = sentence.split("");

        for (int j = 0; j < sentenceArray.length; j++) {
            switch (sentenceArray[j]) {
                case "a":
                    a += 1;
                    break;
                case "e":
                    e += 1;
                    break;
                case "i":
                    i += 1;
                    break;
                case "o":
                    o += 1;
                    break;
                case "u":
                    u += 1;
                    break;
            }
            consonant = sentenceArray.length - (a + e + i + o + u);
        }



        System.out.println("a:"+a);
        System.out.println("e:"+e);
        System.out.println("i:"+i);
        System.out.println("o:"+o);
        System.out.println("u:"+u);
        System.out.println("consonant:"+consonant);
    }
}