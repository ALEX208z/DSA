// https://leetcode.com/problems/reverse-linked-list


public class ReverseLinkedList {
}

class ListNode{
    int val;
    ListNode next;


    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class Solution {
    public ListNode ReverseList(ListNode head) {
        ListNode previous = null;
        ListNode current = head;

        while (current != null) {
            ListNode nextTemp = current.next;
            current.next = previous;
            previous = current;
            current = nextTemp;
        }
        return previous;   // new head
    }

}


