package week9;

import java.lang.*;
class Homework1 {

    public static String len_check(String str) throws RuntimeException {
        // fill here!
        if (str == null) throw new RuntimeException("null");
        if (str.length() > 20) {
            throw new RuntimeException("More than 20 words");
        }
        return str;
    }
    public static void main(String[] args) {
        try {
            System.out.println(len_check("abcdefghijklmnopqrs"));//abcdefghijklmnopqrs
            System.out.println(len_check("abcdefghijklmnopqrsuvw"));
            System.out.println(len_check(null));
        } catch (RuntimeException e) {
            System.out.println(e.toString());
        }
    }
}