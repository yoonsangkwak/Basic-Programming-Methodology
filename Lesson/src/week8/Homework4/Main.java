package week8.Homework4;

class Main {
    public static void main(String[] args) {
        Task t1 = new Task("program1", 7);
        t1.setPriority(7);
        t1.setComplexity(10);
        System.out.println(t1.toString());
        // program1(time: 7, priority: 7, complexity: 10)

        Task t2 = new Task("main Program", 10);
        t2.setPriority(1);
        t2.setComplexity(9);
        System.out.println(t2.toString());
        // main Program(time: 10, priority: 1, complexity: 9)
    }
}