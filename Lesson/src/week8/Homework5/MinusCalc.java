package week8.Homework5;

public class MinusCalc extends Calculator {
    public MinusCalc(int n1, int n2) {
        // 여기에 코드를 완성하세요.
        super(n1, n2);
    }
    public int calc() {
        // 여기에 코드를 완성하세요.
        return super.getNum1() - super.getNum2();
    }
}