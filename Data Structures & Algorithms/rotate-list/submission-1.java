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
    public ListNode rotateRight(ListNode head, int k) {
        int n = 0;
        ListNode dummy = head;
        while(dummy != null){
            dummy = dummy.next;
            n++;
        }

        if(n == 1) return head;

        k = k % n;

        ListNode p1 = head;
        int i = 0;
        while(p1.next != null && i < n-k-1){
            p1 = p1.next;
            i++;
        }

        ListNode p2 = p1.next;
        p1.next = null;

        ListNode tail = p2;
        while(tail.next != null){
            tail = tail.next;
        }

        tail.next = head;

        return p2;
    }
}