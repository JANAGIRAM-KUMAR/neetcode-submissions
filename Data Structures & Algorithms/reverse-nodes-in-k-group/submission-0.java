/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {
 }
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;
        int count = 0;
        
        ListNode check = head;
        for (int i = 0; i < k; i++) {
            if (check == null) return head;
            check = check.next;
        }

        while(count < k){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }
        
        if (current != null) {
            head.next = reverseKGroup(current, k);
        }
        return prev;
    }
}