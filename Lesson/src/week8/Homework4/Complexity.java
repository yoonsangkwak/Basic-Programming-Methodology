package week8.Homework4;

// 난이도에 대한 인터펫이스
public interface Complexity {
    // 난이도를 변경한다.
    public abstract void setComplexity(int newComplexity);
    // 난이도를 알려준다.
    public abstract int getComplexity();
}