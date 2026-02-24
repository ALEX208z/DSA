// https://leetcode.com/problems/reverse-linked-list-ii


public class ReverseLinkedListII {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) return head;

        // Find the node before reversal (nodeBefore)
        ListNode nodeBefore = null;
        ListNode curr = head;
        int pos = 1;

        while (pos < left) {
            nodeBefore = curr;
            curr = curr.next;
            pos++;
        }
        ListNode firstNode = curr; // will become last after reversal
        ListNode prev = null;

        // Reverse the segment
        while (pos <= right) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            pos++;
        }

        // Reconnect
        firstNode.next = curr;  // Connect tail to rest

        if (nodeBefore != null) {
            nodeBefore.next = prev;  // Connect node before to new head
            return head;
        } else {
            return prev;  // New head when left = 1;
        }
    }
}
