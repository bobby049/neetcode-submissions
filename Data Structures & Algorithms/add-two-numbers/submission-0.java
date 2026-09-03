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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int num1 = 0, num2 = 0, count1 = 0, count2 = 0;
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        while (curr1 != null) {
            num1 += curr1.val * (int)Math.pow(10, count1);
            count1++;
            curr1 = curr1.next;
        }
        while (curr2 != null) {
            num2 += curr2.val * (int)Math.pow(10, count2);
            count2++;
            curr2 = curr2.next;
        }
        int sum = num1 + num2;
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        if (sum == 0) {
            return dummy;
        }
        while (sum > 0) {
            int digit = sum % 10;

            curr.next = new ListNode(digit);
            curr = curr.next;

            sum = sum / 10;
        }
        return dummy.next;
    }
}