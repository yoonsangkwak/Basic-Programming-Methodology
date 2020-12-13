public class Q4 {
    public static int[] computeFrequency(String s) {
        // 소문자로 변환해주고
        s = s.toLowerCase();

        int[] freq = new int[25];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // 알파벳외엔 무시
            if (c >= 'a' && c <= 'z') {
                int index = c - 'a';
                freq[index]++;
            }
        }
        return freq;
    }
    public static void main(String[] args) {
        int[] result = computeFrequency("ABCDss123");
        for (int i = 0; i < 25; i++)
            System.out.print(result[i] + " ");
        // should print “1 1 1 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 2 0 0 0 0 0 0”
    }
}
