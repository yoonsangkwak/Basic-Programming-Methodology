public class Q1 {
    public static String reverse(String s) {
        String result = "";

        // i의 시작점은 length-1
        for (int i = s.length()-1; i >= 0; i--) {
            result = result + s.charAt(i);
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(reverse("abcd")); // should print “dcba”
    }
}
