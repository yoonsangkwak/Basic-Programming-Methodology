package week3.Homework6;

public class CatHappy {
    // 고양이 이름
    private String name;
    // 고양이의 예민한 정도. 1~5 사이의 값을 가진다.
    private int sensitive;
    // 고양이의 행복도. 높을수록 행복함을 나타낸다.
    private double happiness;

    public CatHappy(String nameIn, int sensitiveIn) {
        name = nameIn;
        sensitive = sensitiveIn;
        // 기본 행복도는 50으로 한다.
        happiness = 50;
    }
    public String toString() {
        return name + "'s happiness: " + happiness;
    }
    // 고양이 이름을 변경한다.
    public void setName(String newName) {
        // 코드를 완성하세요.
        name = newName;
    }
    // 고양이 이름을 반환한다.
    public String getName() {
        // 코드를 완성하세요.
        return name;
    }
    // 고양이의 감수성을 반환한다.
    public int getSensitive() {
        // 코드를 완성하세요.
        return sensitive;
    }
    // 고양이의 행복도를 반환한다.
    public double getHappiness() {
        // 코드를 완성하세요.
        return happiness;
    }
    // 행동 함수들
    // 놀기: 행복도를 감수성의 반 만큼 증가시킨다.
    public void play() {
        // 코드를 완성하세요.
        happiness += (sensitive / 2);
    }
    // 잠자기: 행복도를 3 증가시키고,감수성의 30% 만큼 더 증가시킨다.
    public void sleep() {
        // 코드를 완성하세요.
        happiness += (3 + (sensitive * 0.3));
    }
    // 지루함: 행복도를 감수성의 4배 만큼 감소시킨다.
    public void boring() {
        // 코드를 완성하세요.
        happiness -= (sensitive * 4);
    }
    // 그루밍: 행복도를 1 증가시킨다.
    public void grooming() {
        // 코드를 완성하세요.
        happiness += 1;
    }
    // 아무것도 안함: 행복도를 2 감소시킨다.
    public void nothing() {
        // 코드를 완성하세요.
        happiness -= 2;
    }
}