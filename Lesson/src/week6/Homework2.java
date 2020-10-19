package week6;

class Homework2 {
    public static String[] getSuffixArray (String s) {
        // fill here!
        int size = s.length();
        String[] suffix_arr = new String[size];
        for (int i = 0; i < size; i++) {
            suffix_arr[i] = s.substring(i);
        }
        return suffix_arr;
    }
    public static void main(String[] args) {
        String[] suffix_arr = getSuffixArray("program");
        for (int i = 0; i < suffix_arr.length; i++) {
            System.out.println(suffix_arr[i]); // program, rogram, ogram, gram, ram, am, m
        }
    }
}