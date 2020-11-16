package week9;

import java.lang.*;
class Homework1 {

    public static String len_check(String str) {
        // fill here!
        try {
            if (str.length() > 20) throw new RuntimeException();
            if (str == null) throw new RuntimeException();
            return str;
        }
        catch (RuntimeException e) {
            System.out.println(e.toString());
        }
        catch (NullPointerException e) {
            System.out.println(e.toString());
        }
    }
    public static void main(String[] args) {

        System.out.println(len_check("abcdefghijklmnopqrs"));//abcdefghijklmnopqrs
        System.out.println(len_check("abcdefghijklmnopqrsuvw"));
        System.out.println(len_check(null));
    }
}