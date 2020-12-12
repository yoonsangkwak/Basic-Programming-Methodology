public class Q6 {
    public static String getConcat(Object[] arr) {
        // 문자열 타입만 더해서 반환
        String answer = "";
        for (Object obj: arr) {
            if (obj instanceof String) {
                answer += obj;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Object[] a = new Object[5];
        a[0] = 10;
        a[1] = "a";
        a[2] = 1.0;
        a[3] = 2;
        a[4] = "b";
        System.out.println(getConcat(a)); // ab
    }
}