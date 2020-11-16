package week9.Homework5;

// 하루의 시간을 나타내는 클래스
import java.util.*;

public class TimeOfDay {
    private int hour;
    private int minute;

    // 시와 분을 0으로 초기화 하는 생성자
    public TimeOfDay() {
        hour = 0;
        minute = 0;
    }
    // 주어진 시간(hh:mm)이 유효하면 시간을 적절하게 변경하고
    // 유효하지 않으면 적절한 유형의 예외를 발생시킨다.
    public void setTimeTo(String aTime) throws InvalidTimeFormatException, InvalidHourException, InvalidMinuteException {
        int hourFound;    // 시간의 시
        int minuteFound;  // 시간의 분

        // 구분 문자로 ':' 를 사용한다.
        Scanner scan = new Scanner(aTime);
        scan.useDelimiter(":");

        // 주어진 시간에서 시를 따로 저장한다.
        // 시를 나타내는 값이 정수가 아니라면
        // '시가 정수 값이 아니다'라는 메시지를 갖는
        // InvalidTimeFormatException 예외를 발생시킨다
        try {
            hourFound = scan.nextInt();
        }
        catch (Exception e) {
            throw new InvalidTimeFormatException("시가 정수 값이 아니다");
        }

        // 시를 나타내는 값이 0보다 작거나 23보다 크다면
        // '시가 0부터 23사이의 범위 밖에 있다'라는 메시지를 갖는
        // InvalidHourException 예외를 발생시킨다
        // 여기에 코드를 완성하세요.

        // 분을 따로 저장한다.
        String minuteString = scan.next();

        // 분을 나타내는 값이 정수가 아니라면
        try {
            minuteFound = Integer.parseInt(minuteString);
        }
        catch (Exception e) {
            // '분이 정수값이 아니다'라는 메시지를 갖는
            // InvalidTimeFormatException 예외를 발생시킨다
            // 여기에 코드를 완성하세요
        }

        // 분을 나타내는 값이 0보다 작거나 59보다 크다면
        // '분이 0부터 59사이의 범위 밖에 있다'라는 메시지를 갖는
        // InvalidMinuteException 예외를 발생시킨다
        // 여기에 코드를 완성하세요

        // 시를 변경한다
        hour = hourFound;

        // 분을 변경한다
        // 여기에 코드를 완성하세요

    }

    // 시간의 모든 데이터를 알려 준다
    public String toString() {
        return ("Time: " + hour + ":" + minute);
    }
}