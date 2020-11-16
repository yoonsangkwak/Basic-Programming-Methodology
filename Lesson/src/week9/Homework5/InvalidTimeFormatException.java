package week9.Homework5;

// 시간이 유효하지 않다는 것을 나타내는 예외
public class InvalidTimeFormatException extends Exception {
    public InvalidTimeFormatException() {}
    // 예외가 발생한 이유를 받아 객체를 생성한다.
    public InvalidTimeFormatException(String reason) {
        super(reason);
    }
}