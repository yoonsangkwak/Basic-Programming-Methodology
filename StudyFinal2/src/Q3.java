public class Q3 {
    public static int search(int key, int[] a) {
        return search(key, a, 0, a.length);
    }
    public static int search(int key, int[] a, int lo, int hi) {
        // 이분탐색 모범답안
//        if (hi <= lo) return -1;
//        int mid = lo + (hi - lo) / 2;
//        int cmp = a[mid] == key ? 0 : (a[mid] < key ? -1 : 1);
//        if      (cmp > 0) return search(key, a, lo, mid);
//        else if (cmp < 0) return search(key, a, mid+1, hi);
//        else              return mid;

        if (hi <= lo) return -1;
        int mid = (lo + hi) / 2;
        int cmp;

        if (a[mid] == key) {
            cmp = 0;
        } else if (a[mid] < key) {
            cmp = -1;
        } else {
            cmp = 1;
        }

        if (cmp == 1) {
            return search(key, a, lo, mid);
        } else if (cmp == -1) {
            return search(key, a, mid + 1, hi);
        } else {
            return mid;
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[4];
        arr[0] = 1; arr[1] = 2; arr[2] = 3; arr[3] = 4;
        System.out.println(search(3, arr)); // should print “2”
    }
}
