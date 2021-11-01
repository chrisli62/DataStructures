// Singly-linked lists are already defined with this interface:
// class ListNode<T> {
//   ListNode(T x) {
//     value = x;
//   }
//   T value;
//   ListNode<T> next;
// }
//
boolean isListPalindrome(ListNode<Integer> l) {
    ListNode slow = l, fast = l;
    
    while(fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }
    
    // odd length linked list
    if(fast != null) {
        slow = slow.next;
    }
    
    // reverse second half of linked list
    slow = reverse(slow);
    fast = l;
    
    // comparison
    while(slow != null) {
        if(!fast.value.equals(slow.value)){
            return false;
        }
        fast = fast.next;
        slow = slow.next;
    }
    return true;
}

public ListNode reverse(ListNode<Integer> head) {
    ListNode prev = null;
    while(head != null) {
        ListNode temp = head.next;
        head.next = prev;
        prev = head;
        head = temp;
    }
    return prev;
}
