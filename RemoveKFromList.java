// Singly-linked lists are already defined with this interface:
// class ListNode<T> {
//   ListNode(T x) {
//     value = x;
//   }
//   T value;
//   ListNode<T> next;
// }
//
ListNode<Integer> removeKFromList(ListNode<Integer> l, int k) {
    if (l == null)
        return null;

    l.next = removeKFromList(l.next, k);

    if (l.value == k)
        return l.next;

    return l;
}
