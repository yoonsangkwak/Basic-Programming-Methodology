package week9;

class Main {
    public static int fact(int n) {

        try {
            // fill here!
        }
        catch (IllegalArgumentException e) {
            // fill here!
        }

        return n;
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
        //120

        System.out.println(fact(-5));
        //Negative numbers cannot be calculated
        //-5


    }
}