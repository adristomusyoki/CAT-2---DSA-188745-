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




## 2. Arrays vs. Linked Lists

Arrays and linked lists are fundamental data structures with different characteristics in terms of memory allocation, performance, and operations.

### Memory Allocation

- **Arrays**:
  - Use contiguous memory allocation.
  - The entire array's size must be known at compile-time.
  - Size cannot be easily changed during runtime.

- **Linked Lists**:
  - Use dynamic memory allocation.
  - Each node is allocated memory separately, leading to non-contiguous memory usage.
  - Offers flexibility in size, as nodes can be added or removed dynamically.

### Performance

- **Arrays**:
  - Provide constant time complexity `O(1)` for random access.
  - Elements are stored contiguously and can be accessed directly via index.

- **Linked Lists**:
  - Provide sequential access.
  - To access a node, you may need to traverse the list from the beginning, leading to `O(n)` time complexity for accessing elements.

### Insertion and Deletion Operations

- **Arrays**:
  - Insertion: Adding an element to the array.
  - Deletion: Removing an element from the array.
  - Both operations can be costly (`O(n)`) if elements need to be shifted to maintain order.

- **Linked Lists**:
  - Insertion: Adding a new node to the linked list.
  - Deletion: Removing an existing node from the linked list.
  - Both operations are generally more efficient (`O(1)` for head/tail operations, `O(n)` for middle operations) compared to arrays.

---
