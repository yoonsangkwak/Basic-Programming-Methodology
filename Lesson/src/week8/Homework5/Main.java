package week8.Homework5;

class Main {
    public static void main(String[] args) {
        PlusCalc c1 = new PlusCalc(2, 3);
        System.out.println(c1.calc()); // 5

        MinusCalc c2 = new MinusCalc(7, 5);
        System.out.println(c2.calc()); // 2

        MultiCalc c3 = new MultiCalc(8, 7);
        System.out.println(c3.calc()); // 56
    }
}