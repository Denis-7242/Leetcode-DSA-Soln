# 622. Design Circular Queue (Java Solution)

This repository contains my Java solution for the LeetCode problem:  
**[622. Design Circular Queue](https://leetcode.com/problems/design-circular-queue/)**

---

## 📌 Problem Description
Design your own circular queue implementation.  

The circular queue should support the following operations:

1. **MyCircularQueue(int k)**  
   - Initializes the queue with a maximum size of `k`.

2. **boolean enQueue(int value)**  
   - Inserts an element into the circular queue. Returns `true` if successful.

3. **boolean deQueue()**  
   - Deletes an element from the circular queue. Returns `true` if successful.

4. **int Front()**  
   - Gets the front item from the queue. Returns `-1` if empty.

5. **int Rear()**  
   - Gets the last item from the queue. Returns `-1` if empty.

6. **boolean isEmpty()**  
   - Checks whether the circular queue is empty.

7. **boolean isFull()**  
   - Checks whether the circular queue is full.

---

## 🚀 Java Solution
```java
class MyCircularQueue {
    private int[] queue;
    private int size, front, rear, count;

    public MyCircularQueue(int k) {
        queue = new int[k];
        size = k;
        front = 0;
        rear = -1;
        count = 0;
    }

    public boolean enQueue(int value) {
        if (isFull()) return false;
        rear = (rear + 1) % size;
        queue[rear] = value;
        count++;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) return false;
        front = (front + 1) % size;
        count--;
        return true;
    }

    public int Front() {
        return isEmpty() ? -1 : queue[front];
    }

    public int Rear() {
        return isEmpty() ? -1 : queue[rear];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == size;
    }
}


🛠 How to Run

Clone the repository:

git clone https://github.com/Denis-7242/leetcode-622-design-circular-queue.git
cd leetcode-622-design-circular-queue

Compile and run:

javac MyCircularQueue.java
java MyCircularQueue

📖 Notes

The solution uses a fixed-size array and modular arithmetic to achieve circular behavior.

Each operation runs in O(1) time.

This design is efficient and avoids unnecessary resizing.

✨ Solution by Denis-7242