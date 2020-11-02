package week8.Homework4;

// 과업에 대한 클래스
// 난이도와 우선순위를 동시에 구현한다.
public class Task implements Priority, Complexity {
    private String name;    // 과업의 이름
    private int time;       // 소요 시간
    private int priority;   // 우선순위
    private int complexity; // 난이도

    // 과업의 이름과 소요 시간을
    // 주어진 값으로 초기화하고
    // 우선순위를 1로 하고
    // 난이도를 1로 하는 생성자
    public Task(String taskName, int taskTime) {
        // 여기에 코드를 완성하세요.
    }
    // 과업의 이름을 반환
    public String getName() {
        // 여기에 코드를 완성하세요.
    }
    // 과업의 소요 시간을 반환
    public int getTime(){
        // 여기에 코드를 완성하세요.
    }
    // 과업의 우선순위를 알려주는 메소드 구현
    // 여기에 코드를 완성하세요.

    // 과업의 난이도를 알려주는 메소드 구현
    // 여기에 코드를 완성하세요.

    // 과업의 이름을 변경
    public void setName(String newName) {
        // 여기에 코드를 완성하세요.
    }
    // 과업의 소요 시간을 변경
    public void setTime(int newtime) {
        // 여기에 코드를 완성하세요.
    }
    // 과업의 우선순위를 변경하는 메소드 구현
    // 여기에 코드를 완성하세요.

    // 과업의 난이도를 변경하는 메소드 구현
    // 여기에 코드를 완성하세요.

    // 과업의 정보를 반환
    public String toString() {
        return (getName() + "(time: " + getTime() + ", priority: " + getPriority() + ", complexity: " + getComplexity() + ")");
    }
}