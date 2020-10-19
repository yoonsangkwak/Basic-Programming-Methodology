package week6;

class Homework4 {
    public static int longest_incseq(int[] arr) {
        // fill here!
        int length = 1;
        int standard = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[standard] < arr[i]) {
                length++;
                standard = i;
            }
        }
        return length;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20, 50};
        System.out.println(longest_incseq(arr)); // 4
    }
}