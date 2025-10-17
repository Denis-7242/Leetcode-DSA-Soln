# Palindrome Number (LeetCode Problem 9)
## 📌 Problem
Given an integer `x`, return `true` if `x` is a **palindrome**, and `false` otherwise.  

A palindrome number is a number that reads the same backward as forward.  

### Examples
- `121` → true  
- `-121` → false  
- `10` → false  

🔗 [View the Problem on LeetCode](https://leetcode.com/problems/palindrome-number/)

## 💡 Approach
### Key Points
- Negative numbers are **not palindromes**  
- Numbers ending in `0` are **not palindromes** (except `0`)  
- Instead of reversing the entire number (which may cause overflow), we **reverse only half of it** and compare  

### Benefits
- Works for both **even** and **odd** length numbers
- Avoids string conversion for efficiency

## 📝 Solution

```java
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
}
```

## 🧪 Test Cases
```java
public static void main(String[] args) {
    Solution solution = new Solution();
    int[] tests = {121, -121, 10, 1221, 0, 1, 123454321};
    for (int n : tests) {
        System.out.println(n + " -> " + solution.isPalindrome(n));
    }
}
```

## 📚 References
- LeetCode Problem 9: Palindrome Number

## 👨‍💻 Author
Solution by Denis-7242
