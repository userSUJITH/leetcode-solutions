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
    int sum =0;
    public int diameterOfBinaryTree(TreeNode root) {
        // sum=0;
       height(root);
       return sum;
    
    }
    public  int height(TreeNode root){
        if(root == null){
            return 0;
        }
        int l = height(root.left);
        int r = height(root.right);
        sum = Math.max(sum,l+r);
        return 1+Math.max(l,r);
    }
}