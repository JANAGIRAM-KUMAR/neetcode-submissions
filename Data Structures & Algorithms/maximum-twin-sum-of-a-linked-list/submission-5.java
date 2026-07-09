/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        if(head == null) return 0;

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null ){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null;
        ListNode next = null;
        ListNode curr = slow;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        ListNode h1 = head;
        ListNode h2 = prev;
        int maxSum = 0;

        while(h1.next != null){
            int sum = h1.val + h2.val;
            maxSum = Math.max(maxSum,sum);
            h1 = h1.next;
            h2 = h2.next;
        }

        return maxSum;
    }
}