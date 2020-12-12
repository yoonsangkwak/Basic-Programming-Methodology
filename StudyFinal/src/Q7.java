public class Q7 {
    public static boolean isPrime(int n) throws RuntimeException{
        // modify this function!
        try {
            if (n > 2 || n < 1000000) {
                throw new RuntimeException("hi");
            }
        } catch (RuntimeException e) {
            e.getMessage();
        }

        boolean answer = true;
        boolean item_found = false;
        int current = n / 2;
        while ( !item_found  &&  current > 1 ) {
            if ( n % current == 0 ) item_found = true;
            else current = current - 1;
        }
        if ( item_found ) answer = false;
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(11)); // true
        System.out.println(isPrime(1000001)); // RuntimeException
        System.out.println(isPrime(1)); // RuntimeException
    }
}
