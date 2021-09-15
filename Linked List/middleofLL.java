// Given the head of a singly linked list, return the middle node of the linked list.
//If there are two middle nodes, return the second middle node.

// Aprroach :  When traversing the list with a pointer slow, make another pointer fast that traverses twice as fast. When fast reaches the end of the list, slow must be in the middle.

public class middleofLL {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
        
    }
}
