public class Solution {
    public boolean isPalindrome(int x) {
        
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;
        while (x > reversedHalf) {
            int digit = x % 10;
            reversedHalf = reversedHalf * 10 + digit;
            x /= 10;
        }

        return x == reversedHalf || x == reversedHalf / 10;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] tests = {121, -121, 10, 1221, 0, 1, 123454321};
        for (int n : tests) {
            System.out.println(n + " -> " + solution.isPalindrome(n));
        }
    }
}



