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
    public ListNode mergeTwo(ListNode a,ListNode b){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while(a != null && b!= null){
            if(a.val <= b.val){
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }
        if(a == null){
            tail.next = b;
        } else {
            tail.next = a;
        }
        return dummy.next;
    }
    public ListNode divideAndMerge(int l,int r, ListNode[] lists){
        if(l > r) return null;
        if(l == r) return lists[l];
        int mid = l + (r - l) / 2;
        ListNode head1 = divideAndMerge(l,mid,lists);
        ListNode head2 = divideAndMerge(mid+1,r,lists);

        ListNode head = mergeTwo(head1, head2);
        return head;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) return null;
        return divideAndMerge(0,lists.length - 1,lists);
    }
}
