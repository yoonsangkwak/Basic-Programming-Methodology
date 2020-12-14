class ScoreBook {
    private int[] scores; // 학생들의 점수들 배열
    private int  n_students; // 총 학생 수
    public ScoreBook(int max_students) {
        // fill here!
        n_students = max_students;
        scores = new int[n_students];
    }
    public void add_score (int score) { // 한명의 점수를 추가기록
        // fill here!
        for (int i = 0; i < n_students; i++) {
            if (scores[i] == 0) {
                scores[i] = score;
                break;
            }
        }
    }
    public double getAverage() { // 평균 계산
        // fill here!
        int count = 0;
        double average = 0;
        for (int j = 0; j < scores.length; j++) {
            if (scores[j] != 0) {
                average += scores[j];
                count++;
            }
        }
        return average / count;
    }
    public double getStdDev() { // 표준편차 계산
        // fill here!
        int totalScore = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] != 0) {
                totalScore += scores[i];
            }
        }
        return Math.sqrt(Math.pow(totalScore - getAverage(), 2) / n_students);
    }
}
public class Q4 {
    public static void main(String[] args) {
        ScoreBook sb = new ScoreBook(100);
        sb.add_score(79);
        sb.add_score(98);
        sb.add_score(62);
        System.out.println("Avg : " + sb.getAverage()); // Avg : 79.666...
        System.out.println("StdDev : " + sb.getStdDev()); // StdDev : 14.704...
    }
}
