import java.util.List;

//Add two numbers in linked list

//This is very famous question which may ask in many interviews.

//Given two linked list and we have to add the number present in the Linked List.

// Approach : use a dummy node two store the value of first linked list and add the linkedlist value to sum the remaining number will be added as carry which get transfer to other
public class addTwoNo {
    public ListNode addtwo(ListNode list_1, ListNode list_2){
        ListNode dummy_node = new ListNode();
        ListNode temp_node = dummy_node;

        while(list_1 != null || list_2 != null || carry == 1) {
            int sum = 0;
            if(list_1 != null){
                sum += list1.val;
                list_1 = list_1.next;
            }
            if(list_2 != null) {
                sum += list_2.val;
                list_2 = list_2.next;
            }
            sum += carry;
            carry = sum / 10;
            ListNode node = new ListNode(sum % 10);
            temp.next = node;
            temp = temp.next;
        }
        return dummy_node.next;
    }
}
