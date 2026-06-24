// Algorithm :

// 1. Create odd pointer at head.
// 2. Create even pointer at head.next.
// 3. Save evenHead.
// 4. Connect odd nodes together.
// 5. Connect even nodes together.
// 6. Move odd and even pointers.
// 7. After loop, connect odd list with evenHead.
// 8. Return head.
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}