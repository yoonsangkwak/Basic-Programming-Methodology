package week6;

class Homework6 {
    public static int max_sum(int [] arr) {
        // fill here !
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
            rank[n_largerthan_me] = arr[i];
        }
        return rank[0] + rank[1];
    }
    public static void main(String[] args) {
        int [] arr = {9, 12, 4, 7, 6};
        int result = max_sum(arr);
        System.out.println(result);
        // 21
    }
}