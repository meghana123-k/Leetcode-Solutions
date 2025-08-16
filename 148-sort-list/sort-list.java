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
    public ListNode sortList(ListNode head) {
        List<Integer> lst = new ArrayList<>();
        ListNode temp = head;
        while(temp != null) {
            lst.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(lst);

        ListNode head1 = new ListNode(-1);
        ListNode curr = head1;
        for(int num : lst) {
            curr.next = new ListNode(num);
            curr = curr.next;
        }
        return head1.next;
    }
}