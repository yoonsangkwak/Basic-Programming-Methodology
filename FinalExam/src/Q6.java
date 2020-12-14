public class Q6 {
    public static double string2double(String s) {
        // fill here!
        try {
            return Double.parseDouble(s);
        } catch (NullPointerException e) {
            return -1;
        } catch (NumberFormatException e) {
            return -2;
        }
    }
    public static void main(String[] args) {
        System.out.println(string2double(null)); // -1.0
        System.out.println(string2double("abc")); // -2.0
        System.out.println(string2double("3.8")); // 3.8
    }
}
