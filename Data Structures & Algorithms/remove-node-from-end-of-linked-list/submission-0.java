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
    public ListNode removeNthFromEnd(ListNode head, int n) {
         LinkedList<Integer> list=new LinkedList<>();
         while(head!=null){
            list.add(head.val);
            head=head.next;
         }
         list.remove(list.size()-n);
         ListNode dummy=new ListNode(0);
         ListNode current=dummy;
         for (int value : list) {
            current.next = new ListNode(value);
            current = current.next;
        }

        return dummy.next;
    }
}
