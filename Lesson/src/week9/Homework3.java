package week9;

class Homework3 {
    public static int string_sum(String str) throws NumberFormatException {
        // fill here!
        String[] words = str.split(" ");
        int sum = 0;
        for (String word : words) {
            try {
                sum += Integer.parseInt(word);
            } catch (NumberFormatException e) {
                return 0;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(string_sum("100 q 300")); // 0
        System.out.println(string_sum("100 300")); // 400
    }
}