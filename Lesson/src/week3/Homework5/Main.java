package week3.Homework5;

class Main {
    public static void main(String[] args) {
        Account acc1 = new Account("Lee");
        acc1.deposit(20000);
        acc1.withdraw(7000);
        System.out.println(acc1);
    }
}