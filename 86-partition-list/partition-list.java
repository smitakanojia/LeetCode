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
    public ListNode partition(ListNode head, int x) {
        ListNode left = new ListNode(), p1=left;
        ListNode right = new ListNode(), p2=right;

        while(head!=null){
            if(head.val<x){
                p1.next=head;
                p1=p1.next;
            }
            else{
                p2.next=head;
                p2=p2.next;
            }
            head = head.next;
        }
        p2.next=null;
        p1.next=right.next;
        return left.next;
    }
}