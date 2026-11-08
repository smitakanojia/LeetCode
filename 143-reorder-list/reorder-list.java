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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null) return;
        ListNode slow=head;
        ListNode fast= head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode n = slow.next;
        slow.next=null;//first half
        ListNode prev= null;
        while(n!=null){
            ListNode next = n.next;
            n.next = prev;
            prev=n;
            n= next;
        }
        n= prev;

        ListNode first =  head;
        while(n!=null){
            ListNode temp1= first.next;
            ListNode temp2 = n.next;
            first.next = n;
            n.next = temp1;
            first  = temp1;
            n= temp2;
        }
    }
}