public class Q6 {
    public static int getSum(Object[] arr) {
        // fill here!
        int result = 0;
        for (Object obj : arr) {
            if (obj instanceof Integer) {
                result += (int) obj;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Object[] a = new Object[5];
        a[0] = 10;
        a[1] = "a";
        a[2] = 1.0;
        a[3] = 2;
        a[4] = "b";
        System.out.println(getSum(a)); // should print “12”
    }
}
