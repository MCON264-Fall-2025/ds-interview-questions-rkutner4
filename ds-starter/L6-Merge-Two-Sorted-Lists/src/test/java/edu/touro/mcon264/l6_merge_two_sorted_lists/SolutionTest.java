package edu.touro.mcon264.l6_merge_two_sorted_lists;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testMergeNormalCase() {
        Solution solution = new Solution();

        // l1: 1 -> 3 -> 5
        Solution.ListNode l1 = new Solution.ListNode(1);
        l1.next = new Solution.ListNode(3);
        l1.next.next = new Solution.ListNode(5);

        // l2: 2 -> 4 -> 6
        Solution.ListNode l2 = new Solution.ListNode(2);
        l2.next = new Solution.ListNode(4);
        l2.next.next = new Solution.ListNode(6);

        Solution.ListNode merged = solution.mergeTwoLists(l1, l2);

        int[] expected = {1, 2, 3, 4, 5, 6};
        Solution.ListNode current = merged;
        for (int val : expected) {
            assertNotNull(current);
            assertEquals(val, current.val);
            current = current.next;
        }
        assertNull(current);
    }

    @Test
    void testMergeOneEmptyList() {
        Solution solution = new Solution();

        Solution.ListNode l1 = null;

        // l2: 1 -> 2 -> 3
        Solution.ListNode l2 = new Solution.ListNode(1);
        l2.next = new Solution.ListNode(2);
        l2.next.next = new Solution.ListNode(3);

        Solution.ListNode merged = solution.mergeTwoLists(l1, l2);

        int[] expected = {1, 2, 3};
        Solution.ListNode current = merged;
        for (int val : expected) {
            assertNotNull(current);
            assertEquals(val, current.val);
            current = current.next;
        }
        assertNull(current);
    }

    @Test
    void testMergeWithDuplicates() {
        Solution solution = new Solution();

        // l1: 1 -> 2 -> 4
        Solution.ListNode l1 = new Solution.ListNode(1);
        l1.next = new Solution.ListNode(2);
        l1.next.next = new Solution.ListNode(4);

        // l2: 1 -> 3 -> 4
        Solution.ListNode l2 = new Solution.ListNode(1);
        l2.next = new Solution.ListNode(3);
        l2.next.next = new Solution.ListNode(4);

        Solution.ListNode merged = solution.mergeTwoLists(l1, l2);

        int[] expected = {1, 1, 2, 3, 4, 4};
        Solution.ListNode current = merged;
        for (int val : expected) {
            assertNotNull(current);
            assertEquals(val, current.val);
            current = current.next;
        }
        assertNull(current);
    }

    @Test
    void testMergeTwoEmptyLists() {
        Solution solution = new Solution();

        Solution.ListNode l1 = null;
        Solution.ListNode l2 = null;

        Solution.ListNode merged = solution.mergeTwoLists(l1, l2);

        assertNull(merged); // Expect null for empty input lists
    }
}