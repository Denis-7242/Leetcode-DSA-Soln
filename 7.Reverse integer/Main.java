class Solution {
    public int reverse(int x) {
        long rev = 0;
        while (x != 0) {
            int digit = x % 10;
            rev = rev * 10 + digit;
            x /= 10;
            if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) return 0;
        }
        return (int) rev;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] tests = {123, -456, 1534236469};
        for (int t : tests) {
            System.out.printf("input: %d -> output: %d%n", t, s.reverse(t));
        }
    }
}
