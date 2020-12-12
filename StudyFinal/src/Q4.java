public class Q4 {
    public static int divide(String s) {
        // try - catch로 Exception처리
        try {
            int i = new Integer(s).intValue();
            return (12 / i);
        } catch (ArithmeticException e) {
            return -2;
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(divide("2")); // should print 6
        System.out.println(divide("0")); // should print -2
        System.out.println(divide("abcd")); // should print -1
    }
}
