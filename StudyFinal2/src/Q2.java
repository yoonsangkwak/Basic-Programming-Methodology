import java.util.Vector;

public class Q2 {
    public static int getSum(Vector<Integer> v) {
        int sum = 0;
        for(int i = 0; i < v.capacity(); i++) {
            int n = v.elementAt(i);
            sum += n;
        }
        return sum;
    }
    public static void main(String[] args) {
        // 초기 capacity 설정
        Vector<Integer> v = new Vector<Integer>(4);
        v.add(5); v.add(4); v.add(-1); v.add(2, 100);
        System.out.println(getSum(v)); // should print “108”
    }
}
