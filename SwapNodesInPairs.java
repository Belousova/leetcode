//24. Swap Nodes in Pairs
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
    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode n = head.next;
        if (n==null) {
            return head;
        }
        ListNode k = n.next;
        n.next = head;
        head.next = swapPairs(k);
        return n;
    }
}
