/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     inhttps://imagedelivery.net/CLfkmk9Wzy8_9HRyug4EVA/ac124ee6-207f-41f6-3aaa-dfb35815f200/public$0t val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public void Swap(TreeNode root){
        if(root==null){
            return;
        }
        TreeNode temp=root.left;
        //System.out.println(root.val);
          root.left=root.right;
          root.right=temp;
          Swap(root.left);
          Swap(root.right);

    }
    public TreeNode invertTree(TreeNode root) {
        Swap(root);
        return root;
    }
}
