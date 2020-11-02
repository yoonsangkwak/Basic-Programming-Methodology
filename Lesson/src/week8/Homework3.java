package week8;

interface MyArray {
    int length(); // 현재 배열에 저장된 개수 리턴
    int capacity(); // 배열의 전체 저장 가능한 개수 리턴
    String get_remove(int index); // index에 해당하는 값 반환후, 배열에서 해당 값 없애기.
    boolean set(String val, int index); // index에 해당하는 값으로 val 저장
}

class StringArray implements MyArray {
    private int max_num; // 저장 가능한 값 개수
    private int num; // 저장한 값 개수
    private String[] arr;
    public StringArray(int num) {
        // fill here!
        arr = new String[num];
        max_num = num;
        this.num = 0;
    }
    public int length() {
        // fill here!
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                this.num++;
                this.max_num--;
            }
        }
        return this.num;
    }
    public int capacity() {
        // fill here!
        return arr.length;
    }
    public String get_remove(int index) {
        // fill here!
        String ans;
        ans = arr[index];
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length - 1] = null;
        return ans;
    }
    @Override
    public boolean set(String val, int index) {
        // fill here!
        arr[index] = val;
        return arr[index].equals(val);
    }
}

class Main {
    public static void main(String[] args) {
        MyArray arr = new StringArray(100);
        arr.set("a", 0);
        arr.set("b", 1);
        arr.set("c", 2);
        System.out.println(arr.get_remove(0));//a
        System.out.println(arr.get_remove(0));//b

    }
}