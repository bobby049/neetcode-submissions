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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode curr1=list1;
        ListNode curr2=list2;
        
        ListNode head=new ListNode();
        ListNode curr3=head;
        while(curr1!=null && curr2!=null){
            if(curr2.val<=curr1.val){
                curr3.next=curr2;
                curr3=curr2;
                curr2=curr2.next;
            }
            else{
                curr3.next=curr1;
                curr3=curr1;
                curr1=curr1.next;
            }
        }
        if(curr1 == null){
            curr3.next=curr2;

            //curr2=curr2.next;
        }
        if(curr2 == null){
            curr3.next=curr1;
        }
        return head.next;
    }
}