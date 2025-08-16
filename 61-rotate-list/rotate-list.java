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
    private int height(ListNode head) {
        if(head == null) return 0;
        return height(head.next) + 1;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) return head;
        int n = height(head);
        System.out.print(n);
        k = k % n;
        if(k == 0) return head;
        ListNode curr = head;

        for(int i = 1; i < n-k; i++) {
            curr = curr.next;
        }
        ListNode head2 = curr.next;
        curr.next = null;
        ListNode temp = head2;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;
        ListNode res = head2;
    
        return res;
    }
}