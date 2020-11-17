package week9;

class Homework2 {

    public static int[] get_word_count(String word) throws ArrayIndexOutOfBoundsException{
        int[] word_count = new int[26];
        // fill here!
        String new_word = word.toUpperCase();
        for (int i = 0; i < new_word.length(); i++) {
            try {
                if (new_word.charAt(i) - 'A' < 0 || new_word.charAt(i) - 'A' > 25) throw new ArrayIndexOutOfBoundsException();
                word_count[new_word.charAt(i) - 'A']++;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Not lowercase / uppercase");
            }
        }
        return word_count;
    }

    public static void main(String[] args) {

        int[] word_count = get_word_count("AB-++d");
        for (int i = 0; i < word_count.length; i++) {
            System.out.print((char) ('A' + i) + ":" + word_count[i] + " ");
        }
        //A:1 B:1 C:0 D:1 E:0 F:0 G:0 H:0 I:0 J:0 K:0 L:0 M:0 N:0 O:0 P:0 Q:0 R:0 S:0 T:0 U:0 V:0 W:0 X:0 Y:0 Z:0

    }
}