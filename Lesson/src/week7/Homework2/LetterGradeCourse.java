package week7.Homework2;

public class LetterGradeCourse extends Course {
    int assignScore; // 과제 점수
    int examScore; // 시험 점수

    // 문자 학점 교과목의 변수들 값을 주어진 값들로 초기화한다
    public LetterGradeCourse(String cname) {
        // 여기 에 코드를 입력하세요
        super(cname);
    }

    // 교과목의 과제 점수를 반환한다
    public int getAssignScore() {
        // 여기에 코드를 입력하세요
        return this.assignScore;
    }

    // 교과목의 시험 점수를 반환한다
    public int getExamScore() {
        // 여기에 코드를 입력하세요
        return this.examScore;
    }

    //교과목의 총점을 계산하여 반환한다
    public double getTotal() {
        // 여기에 코드를 입력하세요
        return attendScore * 0.2 + assignScore * 0.3 + examScore * 0.5;
    }
    // 교과목의 학점을 반환한다
    public String getGrade() {
        // 여기에 코드를 입 력 하세요
        String grade;
        if (getTotal() >= 90) {
            grade = "A";
        } else if (getTotal() >= 80) {
            grade = "B";
        } else if (getTotal() >= 70) {
            grade = "C";
        } else if (getTotal() >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        return grade;
    }

    // 교과목의 이름, 출석 점수, 과제 점수와 시험 점수를 반환한다.
    public String toString(){
        // 여기에 코드를 입력하세요
        return super.toString() + "과제 점수: " + this.assignScore + ", 시험 점수: " + this.examScore;
    }

    // 교과목의 과제 점수를 변경한다
    public void setAssignScore(int newAssignScore) {
        // 여기에 코드를 입력하세요
        this.assignScore = newAssignScore;
    }
    // 교과목의 시힘 점수를 변경한다
    public void setExamScore(int newexamScore) {
        // 여기에 코드를 입력하세요
        this.examScore = newexamScore;
    }

}