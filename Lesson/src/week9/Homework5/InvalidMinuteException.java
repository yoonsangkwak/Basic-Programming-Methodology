package week9.Homework5;

// 시간의 분을 나타내는 값이 범위 밖에 있는 예외
public class InvalidMinuteException extends InvalidTimeFormatException {
    // 예외가 발생한 이유를 받아 객체를 생성한다.
    // 여기에 코드를 완성하세요.
    public InvalidMinuteException(String reason) {
        super(reason);
    }
}