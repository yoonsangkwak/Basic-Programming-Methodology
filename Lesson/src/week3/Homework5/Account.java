package week3.Homework5;

public class Account {
    // 예금주
    private String owner;
    // 잔액
    private int balance;

    // 새로운 Account 객체를 생성하는 생성자
    // 잔액을 0으로 초기화한다.
    public Account(String ownerIn) {
        owner = ownerIn;
        balance = 0;
    }

    // 변경자 메소드 - 예금주 이름을 변경한다.
    public void setOwner(String newOwner) {
        // 코드를 작성하세요.
        owner = newOwner;
    }
    // 접근자 메소드 - 예금주 이름을 반환한다.
    public String getOwner() {
        // 코드를 작성하세요.
        return owner;
    }
    // 접근자 메소드 - 잔액을 반환한다.
    public int getBalance() {
        // 코드를 작성하세요.
        return balance;
    }
    // 입금: 잔액을 금액만큼 증가시키고 잔액을 반환한다.
    public int deposit(int amount) {
        // 코드를 작성하세요.
        balance += amount;
        return balance;
    }
    // 출금: 잔액을 금액만큼 감소시키고 잔액을 반환한다.
    public int withdraw(int amount) {
        // 코드를 작성하세요.
        balance -= amount;
        return balance;
    }
    // Account 객체 정보에 대한 문자열을 반환한다.
    public String toString() {
        return "예금주: " + owner + "\n" + "잔액(원): " + balance;
    }
}