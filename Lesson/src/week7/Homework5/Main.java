package week7.Homework5;

class Main {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.set_y(5);
        System.out.println(p1.toString());
        Point p2 = new Point(10, 5);
        System.out.println(p2.toString());
        Circle c1 = new Circle();
        c1.set_x(10);
        c1.setRadius(15);
        System.out.println(c1.toString());
        Circle c2 = new Circle(20, 20, 10);
        System.out.println(c2.toString());
    }
}