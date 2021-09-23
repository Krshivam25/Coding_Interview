// Given a linked list and a value, remove all nodes containing the provided
// value, and return the resulting list.
// Ex: Given the following linked lists and values...

// 1->2->3->null, value = 3, return 1->2->null
// 8->1->1->4->12->null, value = 1, return 8->4->12->null
// 7->12->2->9->null, value = 7, return 12->2->9->null

class RemoveNthnode {
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }
        ListNode current_node = head;
        while (current_node != null && current_node.next != null) {
            if (current_node.next.val == val) {
                current_node.next = current_node.next.next;

            } else {
                current_node = current_node.next;
            }
        }
        return head;
    }
}