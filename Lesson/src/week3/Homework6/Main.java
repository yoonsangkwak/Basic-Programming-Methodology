package week3.Homework6;

class Main {
    public static void main(String[] args) {
        CatHappy cat1 = new CatHappy("Ruby", 3);
        cat1.play();
        cat1.boring();
        cat1.sleep();
        cat1.grooming();
        System.out.println(cat1);
    }
}