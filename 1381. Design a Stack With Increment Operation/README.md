# 1381. Design a Stack With Increment Operation (Java Solution)

This repository contains my Java solution for the LeetCode problem:  
**[1381. Design a Stack With Increment Operation](https://leetcode.com/problems/design-a-stack-with-increment-operation/)**

---

## 📌 Problem Description
Design a stack that supports the following operations in addition to the standard stack operations:

1. **CustomStack(int maxSize)**  
   - Initializes the object with `maxSize`, which is the maximum number of elements in the stack.

2. **void push(int x)**  
   - Adds `x` to the top of the stack if the stack has not reached the `maxSize`.

3. **int pop()**  
   - Removes and returns the top element of the stack, or returns `-1` if the stack is empty.

4. **void increment(int k, int val)**  
   - Increments the bottom `k` elements of the stack by `val`.  
   - If the stack has fewer than `k` elements, increment all of them.

---

## 🚀 Java Solution
```java
class CustomStack {
    private int[] stack;
    private int top;

    public CustomStack(int maxSize) {
        stack = new int[maxSize];
        top = -1;
    }

    public void push(int x) {
        if (top + 1 < stack.length) {
            stack[++top] = x;
        }
    }

    public int pop() {
        if (top == -1) return -1;
        return stack[top--];
    }

    public void increment(int k, int val) {
        int limit = Math.min(k, top + 1);
        for (int i = 0; i < limit; i++) {
            stack[i] += val;
        }
    }
}


🛠 How to Run

Clone the repository:

git clone https://github.com/Denis-7242/leetcode-1381-design-stack-increment.git
cd leetcode-1381-design-stack-increment

Compile and run:

javac CustomStack.java
java CustomStack

📖 Notes

The implementation is straightforward and efficient (O(1) for push and pop, O(k) for increment).

Since problem constraints are small (maxSize ≤ 1000), this direct approach works well.

✨ Solution by Denis-7242