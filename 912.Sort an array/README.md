# 📝 LeetCode 912: Sort an Array

This repository contains my solution for **[LeetCode Problem 912: Sort an Array](https://leetcode.com/problems/sort-an-array/)**.  
The problem requires sorting an array of integers in **ascending order** without using built-in sort functions, ensuring **O(n log n)** time complexity and the smallest possible space complexity.

---

## 🚀 Problem Statement

Given an array of integers `nums`, sort the array in ascending order and return it.

- Must solve without built-in sort.
- Time complexity: **O(n log n)**
- Optimize space usage.

---

## 💡 Approach

I implemented **Quick Sort (in-place)**:

- **Pivot Selection**: Uses the last element as the pivot.  
- **Partitioning**: Rearranges elements smaller than pivot to the left, greater to the right.  
- **Recursion**: Sorts the left and right partitions.  

### 🔑 Why Quick Sort?
- Average time complexity: **O(n log n)**  
- Space complexity: **O(log n)** (recursion stack) → smaller than Merge Sort’s **O(n)**  

---

## 📂 Code

```java
class Solution {
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void quickSort(int[] nums, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(nums, low, high);
            quickSort(nums, low, pivotIndex - 1);
            quickSort(nums, pivotIndex + 1, high);
        }
    }

    private int partition(int[] nums, int low, int high) {
        int pivot = nums[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (nums[j] <= pivot) {
                i++;
                swap(nums, i, j);
            }
        }
        swap(nums, i + 1, high);
        return i + 1;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

🧪 Example

Input: nums = [5,2,3,1]
Output: [1,2,3,5]

Input: nums = [5,1,1,2,0,0]
Output: [0,0,1,1,2,5]

⚙️ How to Run

Clone this repository:

git clone https://github.com/Denis-7242/LeetCode-912-SortArray.git
cd LeetCode-912-SortArray

Compile the Java file:

javac Solution.java

Run the program (example using main method wrapper):

java Solution

🧩 Key Notes

Quick Sort chosen for smaller space usage compared to Merge Sort.

Works in-place.

For worst-case optimization, random pivoting can be applied.

📖 References

LeetCode 912 Problem

Quick Sort Algorithm explanation on GeeksforGeeks

My GitHub Profile: Denis-7242