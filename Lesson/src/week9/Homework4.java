package week9;

class Homework4 {
    public static int fact(int n) throws IllegalArgumentException{

        try {
            // fill here!
            for (int i = n - 1; i > 0; i--) {
                n *= i;
            }
        }
        catch (IllegalArgumentException e) {
            // fill here!
            System.out.println("Negative numbers cannot be calculated");
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