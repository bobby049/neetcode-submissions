/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
       Node naya=head;
       Node old=head;
       if(head==null){
        return null;
       }
       Node next_node = new Node(head.val);
       Node neew=next_node;
       head=head.next;
       while(head!=null){
           neew.next=new Node(head.val);
           head=head.next;
           neew=neew.next;
       }
       Node neew2=next_node;
       HashMap<Node,Node> map=new HashMap<>();
       while(naya!=null){
          map.put(naya,neew2);
          naya=naya.next;
          neew2=neew2.next;
       }
       neew2=next_node;
       while(neew2!=null){
               neew2.random=map.get(old.random);
               neew2=neew2.next;
               old=old.next; 
       }
       return next_node;
    }
}
