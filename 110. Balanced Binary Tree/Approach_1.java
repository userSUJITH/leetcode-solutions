/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
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
    public boolean isBalanced(TreeNode root) {
        int res = chk(root);
        if(res == -1){
            return false;
        }
        return true;
    }
    public static int chk(TreeNode root){
        if(root == null) return 0;
        int l = chk(root.left);
        if(l==-1) return -1;
        int r = chk(root.right);
        if(r==-1) return -1;
        if(Math.abs((l-r))>1) return -1;
        return 1+Math.max(l,r);
    }
}