package week7.Homework5;

public class Circle extends Point {
    private int radius; // 원의 반지름
    private double PI = 3.14; // 원주율
    // 기본값으로 초기화하는 생성자
    public Circle() {
        // 여기에 코드를 완성하세요.
        super();
        this.radius = 5;
    }
    // 주어진 값으로 초기화하는 생성자
    public Circle(int x, int y, int r) {
        // 여기에 코드를 완성하세요.
        super(x, y);
        this.radius = r;
    }
    // 원의 반지름을 반환
    public int getRadius() {
        // 여기에 코드를 완성하세요.
        return this.radius;
    }
    // 원의 반지름을 변경
    public void setRadius(int r){
        // 여기에 코드를 완성하세요.
        this.radius = r;
    }
    // 원의 넓이 = PI*radius*radius
    public double getArea() {
        // 여기에 코드를 완성하세요.
        return PI*radius*radius;
    }
    // 문자열로 반환
    public String toString() {
        return ("중심 = [" + get_x() + ", " + get_y() + "], 반지름 = " + radius + ", 넓이 = " + getArea());
    }
}