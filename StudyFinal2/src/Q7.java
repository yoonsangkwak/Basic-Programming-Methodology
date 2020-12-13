import java.util.StringTokenizer;

public class Q7 {
    public static int getPayroll(String line) {
        // modify this function!
        try {
            StringTokenizer t = new StringTokenizer(line, "|");
            String s = t.nextToken().trim();
            int hours = new Integer(t.nextToken().trim()).intValue();
            int payrate = new Integer(t.nextToken().trim()).intValue();
            return hours * payrate;
        } catch (RuntimeException e) {
            return -1;
        }
    }
    public static void main(String[] args) {
        System.out.println(getPayroll("student | 2 | 4")); // should print “8”
        System.out.println(getPayroll("abcd")); // should print “-1”
        System.out.println(getPayroll("student | a | b")); // should print “-1”
    }
}
