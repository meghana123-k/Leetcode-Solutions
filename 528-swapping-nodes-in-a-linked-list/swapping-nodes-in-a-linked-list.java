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
    public ListNode swapNodes(ListNode head, int k) {
        int n = count(head);
        ListNode temp1 = head;
        
        for(int i = 1; i < k; i++) {
            temp1 = temp1.next;
        }
        ListNode t1 = temp1;
        ListNode temp2 = head;
        for(int i = 1; i < n-k+1; i++) {
            temp2 = temp2.next;
        }
        ListNode t2 = temp2;
        int temp = t1.val;
        t1.val = t2.val;
        t2.val = temp;
        return head;
    } 
    private int count(ListNode head) {
        int len = 0;
        while(head != null) {
            len++;
            head = head.next;
        }
        return len;
    }
}