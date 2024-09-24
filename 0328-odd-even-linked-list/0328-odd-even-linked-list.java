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
        if(head == null || head.next == null) {
            return head;
        }
        ListNode temp = head;
        ListNode oddhead = new ListNode(-1);
        ListNode odd = oddhead;
        ListNode evenhead = new ListNode(-1);
        ListNode even = evenhead;
        int i = 0;
        while(temp != null) {
            if(i%2 == 0) {
                ListNode t = temp;
                temp = temp.next;
                t.next = null;
                odd.next = t;
                odd = odd.next;
            }
            else{
                ListNode t = temp;
                temp = temp.next;
                t.next = null;
                even.next = t;
                even = even.next;
            }
            i++;
        }
        odd.next = evenhead.next;
        return oddhead.next;
    }
}