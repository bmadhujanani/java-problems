class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;

        while (current != null) {

            next = current.next;     // Save next node
            current.next = prev;     // Reverse link

            prev = current;          // Move prev
            current = next;          // Move current
        }

        return prev;
    }
}