package week6;

class Homework5 {
    public static int indexOf_min (int [] arr) {
        // fill here!
        int min = arr[0];
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {
        int [] arr = {9, 12, 4, 7, 6};
        int result = indexOf_min(arr);
        System.out.println(result);
        // 2
    }
}