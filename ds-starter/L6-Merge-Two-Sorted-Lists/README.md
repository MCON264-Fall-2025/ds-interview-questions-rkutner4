#  README Template

##  Problem Statement
> Merge two sorted singly linked lists into one sorted linked list and return the head of the new merged list.
---

##  Assumptions
- Either list may be empty (l1 = null or l2 = null).
- Both input lists are already sorted in ascending order.
- List nodes contain an integer value (val) and a reference to the next node (next)
- The algorithm should reuse existing nodes (not create copies).
- The merged list should maintain sorted order.
- When two nodes have equal values, the node from l1 is chosen first (based on <= comparison).
---

##  Conceptual Solution
1. **Use a dummy node to simplify merging:**
   Create a temporary node (dummy) whose next will eventually point to the head of the merged list.
   Maintain a tail pointer that always points to the last node in the merged list.
2. **Traverse both lists simultaneously:**
   While both l1 and l2 are non-null:
   - Compare l1.val and l2.val.
   - Attach the smaller node to tail.next. 
   - Move the pointer (l1 or l2) forward. 
   - Move the tail forward to the newly added node.3.
3. **Handle equal values:**
   If l1.val == l2.val, choose the node from l1 first because the condition uses <=.
   This makes merging stable (order is preserved).
4. **Attach the remainder of the non-empty list:**
   Once one list is exhausted, attach the other list directly because it is already sorted.
5. **Return the merged list:**
   The merged list starts at dummy.next.
   This approach ensures every node is touched once, giving O(n + m) time and O(1) extra space.
---

##  Example
**Input:**
- l1 = 1 → 3 → 5
- l2 = 2 → 4 → 6


**Expected Output:**
1 → 2 → 3 → 4 → 5 → 6


**Explanation:**
- Compare 1 and 2 → choose **1**
- Compare 3 and 2 → choose **2**
- Compare 3 and 4 → choose **3**
- Compare 5 and 4 → choose **4**
- Compare 5 and 6 → choose **5**
- Append remaining **6**

The result is a sorted linked list containing all nodes from both input lists.   1 → 2 → 3 → 4 → 5 → 6
