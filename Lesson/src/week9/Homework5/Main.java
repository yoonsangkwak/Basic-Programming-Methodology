package week9.Homework5;

class Main {
    public static void main(String[] args) {
        // 0:0 으로 초기화하는 생성자
        TimeOfDay t = new TimeOfDay();

        System.out.println(t);

        // 정상적인 시간 변경
        try {
            t.setTimeTo("1:11");
        } catch (InvalidHourException e) {
            System.out.println(e.getMessage());
        } catch (InvalidMinuteException e) {
            System.out.println(e.getMessage());
        } catch (InvalidTimeFormatException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(t);

        // 예외: 시가 0부터 23사이의 범위 밖에 있다
        try {
            t.setTimeTo("24:35");
        } catch (InvalidHourException e) {
            System.out.println(e.getMessage());
        } catch (InvalidMinuteException e) {
            System.out.println(e.getMessage());
        } catch (InvalidTimeFormatException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(t);

        // 예외: 분이 0부터 59 사이의 범위 밖에 있다
        try {
            t.setTimeTo("10:88");
        } catch (InvalidHourException e) {
            System.out.println(e.getMessage());
        } catch (InvalidMinuteException e) {
            System.out.println(e.getMessage());
        } catch (InvalidTimeFormatException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(t);

        // 예외: 시가 정수 값이 아니다.
        try {
            t.setTimeTo("11-11");
        } catch (InvalidHourException e) {
            System.out.println(e.getMessage());
        } catch (InvalidMinuteException e) {
            System.out.println(e.getMessage());
        } catch (InvalidTimeFormatException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(t);

        // 예외: 분이 정수 값이 아니다
        try {
            t.setTimeTo("20:35/");
        } catch (InvalidHourException e) {
            System.out.println(e.getMessage());
        } catch (InvalidMinuteException e) {
            System.out.println(e.getMessage());
        } catch (InvalidTimeFormatException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(t);
    }
}