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

        LinkedList<Integer> list = new LinkedList<>();

        ListNode slow = head;

        // Store all values
        while (slow != null) {
            list.add(slow.val);
            slow = slow.next;
        }

        // Put values back in reorder: first, last, second, second-last...
        ListNode curr = head;

        while (!list.isEmpty()) {

            curr.val = list.removeFirst();
            curr = curr.next;

            if (!list.isEmpty()) {
                curr.val = list.removeLast();
                curr = curr.next;
            }
        }
    }
}
