import org.w3c.dom.Node;

public class Practice {

//    Two Pointers → Cycle, Middle, K-th from end
//    Dummy Node → Deletions, Merging
//    Reverse → Palindrome, Add numbers
//    Recursion → Problems requiring backtracking
//    Stack → Reverse traversal, Palindrome
//    HashMap → Random pointer, Detect cycle (alternative)



    // Define Node class INSIDE LinkedList
    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    private Node head;
    private int size;

    // rest of your code...
}