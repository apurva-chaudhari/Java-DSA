# Java DSA

A structured collection of **Java solutions to Data Structures and Algorithms problems**, focused on LeetCode practice and coding interview preparation.

I'm building problem-solving skills through consistent practice, clean code, complexity analysis, and topic-wise learning.

## 📊 Progress Overview

| Metric | Count |
|---|---:|
| Problems Solved | 12 |
| Easy | 10 |
| Medium | 2 |
| Hard | 0 |
| Primary Language | Java |
| Practice Platform | LeetCode |

## 📁 Repository Structure

```text
Java-DSA/
├── README.md
└── LeetCode/
    ├── Math/
    │   ├── 1281_SubtractProductAndSumOfDigits.java
    │   └── 1342_NumberOfStepsToReduceNumberToZero.java
    ├── Arrays/
    │   ├── 0026_RemoveDuplicatesFromSortedArray.java
    │   ├── 0055_JumpGame.java
    │   ├── 0121_BestTimeToBuyAndSellStock.java
    │   ├── 0148_RunningSumOf1dArray.java
    │   ├── 0189_RotateArray.java
    │   ├── 0485_MaxConsecutiveOnes.java
    │   └── 1431_KidsWithTheGreatestNumberOfCandies.java
    ├── Hashing/
    │   └── 0217_ContainsDuplicate.java
    └── Strings/
        ├── 0520_DetectCapital.java
        └── 2114_MaximumNumberOfWordsFoundInSentences.java
```

## 🧩 LeetCode Solutions

### Math

| # | Problem | Difficulty | Solution | Time | Space |
|---:|---|---|---|---|---|
| 1281 | [Subtract the Product and Sum of Digits of an Integer](https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/) | Easy | [Java](LeetCode/Math/1281_SubtractProductAndSumOfDigits.java) | O(log n) | O(1) |
| 1342 | [Number of Steps to Reduce a Number to Zero](https://leetcode.com/problems/number-of-steps-to-reduce-number-to-zero/) | Easy | [Java](LeetCode/Math/1342_NumberOfStepsToReduceNumberToZero.java) | O(log n) | O(1) |

### Arrays

| # | Problem | Difficulty | Solution | Time | Space |
|---:|---|---|---|---|---|
| 26 | [Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/) | Easy | [Java](LeetCode/Arrays/0026_RemoveDuplicatesFromSortedArray.java) | O(n) | O(1) |
| 55 | [Jump Game](https://leetcode.com/problems/jump-game/) | Medium | [Java](LeetCode/Arrays/0055_JumpGame.java) | O(n) | O(1) |
| 121 | [Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/) | Easy | [Java](LeetCode/Arrays/0121_BestTimeToBuyAndSellStock.java) | O(n) | O(1) |
| 1480 | [Running Sum of 1d Array](https://leetcode.com/problems/running-sum-of-1d-array/) | Easy | [Java](LeetCode/Arrays/0148_RunningSumOf1dArray.java) | O(n) | O(1) auxiliary |
| 189 | [Rotate Array](https://leetcode.com/problems/rotate-array/) | Medium | [Java](LeetCode/Arrays/0189_RotateArray.java) | O(n) | O(1) |
| 485 | [Max Consecutive Ones](https://leetcode.com/problems/max-consecutive-ones/) | Easy | [Java](LeetCode/Arrays/0485_MaxConsecutiveOnes.java) | O(n) | O(1) |
| 1431 | [Kids With the Greatest Number of Candies](https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/) | Easy | [Java](LeetCode/Arrays/1431_KidsWithTheGreatestNumberOfCandies.java) | O(n) | O(n) |

### Hashing

| # | Problem | Difficulty | Solution | Time | Space |
|---:|---|---|---|---|---|
| 217 | [Contains Duplicate](https://leetcode.com/problems/contains-duplicate/) | Easy | [Java](LeetCode/Hashing/0217_ContainsDuplicate.java) | O(n) average | O(n) |

### Strings

| # | Problem | Difficulty | Solution | Time | Space |
|---:|---|---|---|---|---|
| 520 | [Detect Capital](https://leetcode.com/problems/detect-capital/) | Easy | [Java](LeetCode/Strings/0520_DetectCapital.java) | O(n) | O(1) |
| 2114 | [Maximum Number of Words Found in Sentences](https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/) | Easy | [Java](LeetCode/Strings/2114_MaximumNumberOfWordsFoundInSentences.java) | O(n × m) | O(1)* |

## 📚 Topics

- [x] Math
- [x] Arrays
- [x] Strings
- [x] Hashing
- [ ] Two Pointers
- [ ] Sliding Window
- [ ] Binary Search
- [ ] Sorting
- [ ] Recursion and Backtracking
- [ ] Linked Lists
- [ ] Stacks and Queues
- [ ] Trees and Binary Search Trees
- [ ] Heaps and Priority Queues
- [ ] Graphs
- [x] Greedy Algorithms
- [ ] Dynamic Programming
- [ ] Bit Manipulation

Topics will be marked as covered as I solve more problems.

## 🎯 Goals

- Strengthen Java fundamentals and DSA concepts.
- Progress from basic problems to advanced coding interview questions.
- Understand the intuition and approach behind each solution.
- Analyze time and space complexity.
- Maintain consistent LeetCode practice and meaningful Git commits.
- Prepare for coding assessments and technical interviews.

## 💻 Language and Approach

- **Language:** Java
- **Platform:** LeetCode
- **Organization:** Topic-wise folders with numbered problem filenames.
- **Focus:** Correctness, readable code, efficient approaches, and complexity analysis.

## 📈 Progress Tracking

This repository is updated as new problems are solved. The progress counts, topic checklist, and solution table are maintained to reflect the solutions added to the repository.

---

*Consistency over perfection — one problem at a time.*

*For #2114, O(1) auxiliary space applies when counting spaces using `charAt()`; `toCharArray()` temporarily requires O(m) space.*