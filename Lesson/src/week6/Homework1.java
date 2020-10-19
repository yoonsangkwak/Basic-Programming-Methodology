package week6;

class Homework1 {
    public static int kthbig(int[] arr, int k) {
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
        // rank[i] 가 k-1 인 i를 찾고 arr[i] 반환하기.
        // fill here!
        return rank[k-1];
    }

    public static void main(String[] args) {
        // test code
        int[] arr = {1, 4, 2, 5, 11, 9, 18};
        System.out.println(kthbig(arr, 2));  // 11
    }
}