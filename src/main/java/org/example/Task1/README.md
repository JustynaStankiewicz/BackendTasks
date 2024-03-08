# Task1
### Description:
The input is a long list of integers. Please write a small app that will output the list of distinct elements sorted in ascending order, plus the basic measurement information that contains the number of elements in the source, number of distinct elements, min and max value.
### Solution:
The solution is based on `HashSet`, because it is great to filter out duplicate values, ensuring that only distinct elements are considered. 
The logic behind the output values
1. **Distinct Elements**: Convert the input list of integers into a `HashSet` to remove duplicates.
2. **Sort Elements**: `sorted` opertaion on the `HashSet` to get list of sorted elements in ascending order .
3. **Measurements**:
   - **Count**: Size of the input list.
   - **Distinct**: Size of the `HashSet`
   - **min**: `min` operation on the `HashSet`.
   - **max**: `max` operation on the `HashSet`.

 The `printListInfo` method is crucial for presenting the result output.

## Example Output

Given an input list of `[1, 10, 20, 20, 2, 5]`, the application outputs:

```plaintext
[1, 2, 5, 10, 20]
count: 6
distinct: 5
min: 1
max: 20
