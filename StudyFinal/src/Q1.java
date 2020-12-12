public class Q1 {
    public static int getSum(int[] v) {
        int sum = 0;

        // for문 i <= v를 고쳐줌
        for(int i =0; i < v.length; i++) {
            int n = v[i];
            sum += n;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] v = new int[4];
        v[0] = 5; v[1] = 4; v[2] = -1; v[3] = 100;
        System.out.println(getSum(v)); // should print 108
    }
}
