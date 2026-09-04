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
       Node copy=new Node(head.val);
       Node neew2=copy;
       naya=naya.next;
       HashMap<Node,Node> map=new HashMap<>();
       map.put(head,neew2);
       while(naya!=null){
          neew2.next=new Node(naya.val);
          map.put(naya,neew2.next);
          naya=naya.next;
          neew2=neew2.next;
       }
       neew2=copy;
       while(neew2!=null){
               neew2.random=map.get(old.random);
               neew2=neew2.next;
               old=old.next; 
       }
       return copy;
    }
}
