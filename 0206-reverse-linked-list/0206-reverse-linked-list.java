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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
        {
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        ListNode forward = null;
        while(current != null)
        {
            forward = current.next;
            current.next = previous;
            previous = current;
            current = forward;
        } 
        return previous;
    }
}