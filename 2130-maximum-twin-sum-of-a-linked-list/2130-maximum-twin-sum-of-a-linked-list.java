class Solution {
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
// REVERSE THE HALF PART OF GIVEN LL AFTER FINDING MIDLLE ELEMENT SO WE CAN BE ABLE TO FIND THE MAXIMUM TWIN PAIR , SO ONCE WE REVERSE HALF PART OF GIVEN LL , THEN WE CAN ADD ORIGINAL LL WITH HALF REVERSED LL:

            ListNode prev = null;
            ListNode curr = slow;

            while (curr != null) {
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }


// NOW CLACULATE MAXIMUM TWIN SUM:
                ListNode first = head;
                ListNode second = prev;
                int maxPairSum = 0;

                while (second != null) {
                    maxPairSum = Math.max(maxPairSum , first.val + second.val);

                    first = first.next;
                    second = second.next;      
                }
                return maxPairSum;
            }
        }