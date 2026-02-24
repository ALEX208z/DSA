// https://leetcode.com/problems/merge-two-sorted-lists

public class Merge2SortedLists {

    // Recursive Approach
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Base cases: if one list is empty, return the other
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        // Compare current nodes
        if (list1.val < list2.val) {
            // list1's node is smaller: keep it, merge the rest
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            // list2's node is smaller: keep it, merge the rest
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }



    // Iterative Approach
    public ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
        // 1. Create a dummy node (our anchor)
        ListNode dummy = new ListNode(0);
        // 2. 'tail' is our "building hand" - it always points to the last node we've build
        ListNode tail = dummy;

        // 3. While bothl lists have nodes to compare
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                // Attach the smaller node (from list1)
                tail.next = list1;
                list1 = list1.next;  // Move list1 forward
            } else {
                // Attach the smaller node (from list2)
                tail.next = list2;
                list2 = list2.next;  // Move list2 forward
            }
            // Move our building hand to the new last node
            tail = tail.next;
        }

        // 4. Attach whatever is left (one list might have leftover)
        tail.next = (list1 != null) ? list1 : list2;

        // 5. Return the merged list (skip the dummy)
        return dummy.next;
    }

}
