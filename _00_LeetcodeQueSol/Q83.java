package _00_LeetcodeQueSol;



public class Q83 {

    public class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            ListNode current = head;

            while (current != null && current.next != null) {
                if (current.val == current.next.val) {
                    current.next = current.next.next;
                } else {
                    current = current.next;
                }
            }

            return head;
        }
    }
}
