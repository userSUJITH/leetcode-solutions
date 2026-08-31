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
    int level =0;
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        check(root,level,list);
        return list;
    }
    public void check(TreeNode root,int level,ArrayList<Integer> list){
        if(root == null){
            return ;
        }
        if(level == list.size()){
            list.add(root.val);
        }
        check(root.right,level+1,list);
        check(root.left,level+1,list);
    }
}