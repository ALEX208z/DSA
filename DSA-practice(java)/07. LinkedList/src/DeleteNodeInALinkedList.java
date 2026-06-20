// https://leetcode.com/problems/delete-node-in-a-linked-list

public class DeleteNodeInALinkedList {
    public void deleteNode(ListNode node) {
        // Copy values from the next node to current node
        node.val = node.next.val;
        // Skip the next node (effectively deleting it)
        node.next = node.next.next;
    }
}
