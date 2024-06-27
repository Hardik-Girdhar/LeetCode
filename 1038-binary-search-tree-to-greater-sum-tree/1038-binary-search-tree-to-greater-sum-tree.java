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

// class Solution {
//     int val = 0;
//     public TreeNode bstToGst(TreeNode root) {
//         if (root.right != null) bstToGst(root.right);
//         root.val = root.val + val;
//         val = root.val;
//         if (root.left != null) bstToGst(root.left);
//         return root;
//     }
// }

class Solution {
    int sum = 0;
    public TreeNode bstToGst(TreeNode root) {
        if(root.right != null) bstToGst(root.right);
        root.val = root.val + sum;
        sum = root.val;
        if(root.left != null) bstToGst(root.left);
        return root;
    }
}