# Task2

### Description:
The input is a long list of integers. Provide a working code that will find all the pairs (in this integer list) that sum up to 13. Each pair in the output should have first number not greater than the second one and lines should be sorted in an ascending order.
### Solution:
The solution employs a `HashMap` to efficiently find pairs that sum up to the target value (13). The process involves iterating over the list of integers, calculating the difference between the target and the current number, and checking if this difference already exists in the map. If it does, a pair is found.
A custom `Pair` class is used to store the pairs information. This class implements `Comparable` to ensure pairs are sorted correctly.

All found pairs are sorted in ascending order and then each pair is displayed in seperate line using `printPairs` method.

### Example Output

Given an input list of `[1, 2, 10, 7, 5, 3, 6, 6, 13, 0]`, the application outputs:

```plaintext
0 13
3 10
6 7
6 7
