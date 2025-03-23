# CAT-2---DSA-188745-


## 1. Big O Notation in Algorithm Analysis

Big O notation is used to describe the upper bound of an algorithm's complexity, providing insight into its performance, especially in the worst-case scenario.

### Rules of Big O Notation

1. **Sorting Different Algorithm Complexities**:
   - If one loop runs `O(n)` times inside another `O(n)` loop, the total complexity is `O(n²)`.
   - Example: A nested loop where each loop iterates `n` times results in `O(n²)` complexity.

2. **Comparison Upon Growth Rate**:
   - Different complexities (e.g., `O(1)`, `O(log n)`, `O(n)`, `O(n²)`) impact performance significantly.
   - Example: An algorithm with `O(n)` complexity will perform better than one with `O(n²)` for large inputs.

3. **Worst-Case Analysis**:
   - Big O notation describes the worst-case performance of an algorithm.
   - Example: Even if an algorithm performs well on average, Big O ensures it runs efficiently in the hardest scenarios.


