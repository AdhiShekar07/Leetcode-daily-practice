# Day 4 - LeetCode Practice: Sort 0s, 1s, and 2s (Count-Based Approach)

## 🧠 Problem Statement
Given an array consisting only of 0s, 1s, and 2s, sort the array in ascending order without using any built-in sorting function.

## ✅ Approach
This solution uses a **counting method**:
1. Count the number of 0s, 1s, and 2s in the array.
2. Overwrite the original array based on the counts.

## 🧪 Example
**Input**: [0, 1, 2, 0, 1, 2]  
**Output**: [0, 0, 1, 1, 2, 2]

## 🕒 Time Complexity
O(n) – Single pass for counting and single pass for overwriting.

## 💡 Space Complexity
O(1) – No extra space used except counters.

## 🔁 Tags
Array, Sorting, Count Sort, Easy-Medium
