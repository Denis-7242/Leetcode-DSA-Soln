# 🔄 Reverse Integer (Java)

[![Java](https://img.shields.io/badge/Java-17-orange?logo=java&logoColor=white)](https://www.oracle.com/java/)
[![LeetCode](https://img.shields.io/badge/LeetCode-Problem%207-yellow?logo=leetcode&logoColor=black)](https://leetcode.com/problems/reverse-integer/)
[![License](https://img.shields.io/badge/License-MIT-green)](LICENSE)

This project solves the **Reverse Integer** problem (LeetCode #7).  
Given a signed 32-bit integer `x`, it returns `x` with its digits reversed.  
If reversing `x` causes the value to go outside the signed 32-bit integer range  
`[-2,147,483,648, 2,147,483,647]`, it returns `0`.

---

## 📂 Project Files

- **Solution** → Contains the reverse integer logic.  
- **Main** → Entry point to test the program with sample inputs.  

---

## 📜 Code

```java
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

▶️ How to Run

1.Save the code in a file called Main.java.

2.Compile the program:

javac Main.java

3.Run the program:

java Main

✅ Example Output

input: 123 -> output: 321
input: -456 -> output: -654
input: 1534236469 -> output: 0

🧠 Key Notes

-Uses long during reversal to detect overflow.

-Returns 0 if the reversed integer goes outside the 32-bit signed range.

-Works for both positive and negative integers.

📖 Reference

-LeetCode Problem #7 – Reverse Integer

👨‍💻 Author

Made with ❤️ by Denis-7242

