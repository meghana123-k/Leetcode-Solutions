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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode res = new ListNode(-1);
        ListNode nNode = res;
        ListNode fast = head;
        
        while(fast != null && fast.next != null) {
            nNode.next = new ListNode(fast.val);
            nNode = nNode.next;
            fast = fast.next.next;
        }
        if(fast != null) {
            nNode.next = new ListNode(fast.val);
            nNode = nNode.next;
        }
        ListNode slow = head.next;
        while(slow != null && slow.next != null) {
            nNode.next = new ListNode(slow.val);
            nNode = nNode.next;
            slow = slow.next.next;
        }
        if(slow != null) {
            nNode.next = new ListNode(slow.val);
            nNode = nNode.next;
        }
        return res.next; 
    }
}