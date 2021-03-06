package week7.Homework5;

public class Point {
    private int x_coordinate; // x 좌표
    private int y_coordinate; // y 좌표

    // 기본값으로 초기화하는 생성자
    public Point() {
        // 여기에 코드를 완성하세요.
        this.x_coordinate = 0;
        this.y_coordinate = 0;
    }
    // 특정 좌표 값으로 초기화하는 생성자
    public Point(int x, int y) {
        // 여기에 코드를 완성하세요.
        this.x_coordinate = x;
        this.y_coordinate = y;
    }
    // x좌표를 반환
    public int get_x() {
        // 여기에 코드를 완성하세요.
        return this.x_coordinate;
    }
    // y좌표를 반환
    public int get_y() {
        // 여기에 코드를 완성하세요.
        return this.y_coordinate;
    }
    // x좌표를 변경
    public void set_x(int x) {
        // 여기에 코드를 완성하세요.
        this.x_coordinate = x;
    }
    // y좌표를 변경
    public void set_y(int y) {
        // 여기에 코드를 완성하세요.
        this.y_coordinate = y;
    }
    // 좌표를 [x, y] 형태로 출력하는 메소드
    public String toString() {
        return ("[" + x_coordinate +  ", " + y_coordinate + "]");
    }
}