public class Q2 {
    public static String getConcat(String[] v) {
        String result = "";
        for(int i = 0; i < v.length; i++) {

            // null 값 처리 모범답안
            if (v[i] != null)
//            if (v[i] == null) {
//                v[i] = "";
//            }

            result += v[i].toUpperCase();
        }
        return result;
    }
    public static void main(String[] args) {
        String[] v = new String[3];
        v[0] = "ab";
        v[2] = "ca";
        System.out.println(getConcat(v)); // should print ABCA
    }
}
