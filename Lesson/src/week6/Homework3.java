package week6;

class Homework3 {
    public static int[] merge(int[] arr1, int[] arr2) {
        // fill here!
        int [] arr = new int [arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i];
        }
        for (int j = 0; j < arr2.length; j++) {
            arr[arr1.length + j] = arr2[j];
        }
        int size = arr.length;
        int[] rank = new int[size];  // rank[i] : arr의 원소들 중 arr[i] 보다 큰 수의 갯수
        for (int i = 0; i < size; i++) {
            int n_largerthan_me = 0;   //  arr[i] 보다 큰 수의 갯수
            for (int j = 0; j < size; j++) {
                // fill here!
                if (arr[i] < arr[j]) {
                    n_largerthan_me++;
                }
            }
            // fill here!
            rank[size - n_largerthan_me - 1] = arr[i];
        }
        return rank;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 8, 16};
        int[] arr2 = {3, 6, 9, 12};
        int[] merged = merge(arr1, arr2);
        for (int i = 0 ; i < merged.length; i++) {
            System.out.println(merged[i]);
            // 1 2 3 4 6 8 9 12 16
        }
    }
}