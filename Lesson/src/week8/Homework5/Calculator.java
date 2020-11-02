package week8.Homework5;

public abstract class Calculator {
    private int num1;
    private int num2;
    public Calculator(int n1, int n2) {
        this.num1 = n1;
        this.num2 = n2;
    }
    public int getNum1() {
        return this.num1;
    }
    public int getNum2() {
        return this.num2;
    }
    // 계산을 하는 추상 메소드
    public abstract int calc();
}