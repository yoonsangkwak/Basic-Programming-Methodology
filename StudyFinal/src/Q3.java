public class Q3 {
    public static int search(char key, String a, int lo, int hi) {
        // 이분탐색 모범답안
        if (hi <= lo) return -1;
        int mid = lo + (hi - lo) / 2;
        int cmp = a.charAt(mid) == key ? 0 : (a.charAt(mid) < key ? -1 : 1);
        if      (cmp > 0) return search(key, a, lo, mid);
        else if (cmp < 0) return search(key, a, mid+1, hi);
        else              return mid;

//        lo = 0;
//        hi = a.length();
//        int mid = (lo + hi) / 2;
//
//        while (lo <= hi) {
//            if (key == a.charAt(mid)) {
//                break;
//            } else if (key < a.charAt(mid)) {
//                hi = mid - 1;
//            } else {
//                lo = mid + 1;
//            }
//
//            mid = (lo + hi) / 2;
//        }
//
//        return mid;
    }

    public static int findChar(char c, String s) {
        return search(c, s, 0, s.length());
    }

    public static void main(String[] args) {
        String input = "abcdef";
        int location = findChar('d', input);
        System.out.println( location );  // should print 3
    }
}
