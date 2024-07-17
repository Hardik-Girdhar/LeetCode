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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        Map<Integer, TreeNode> res = new HashMap<>();
        Set<Integer> to_delete_set = new HashSet<>();
        for (int val : to_delete) {
            to_delete_set.add(val);
        }
        res.put(root.val, root);

        recursion(null, root, false, res, to_delete_set);

        return new ArrayList<>(res.values());
    }

    private void recursion(TreeNode parent, TreeNode cur_node, boolean isleft, Map<Integer, TreeNode> res, Set<Integer> to_delete_set) {
        if (cur_node == null) return;

        recursion(cur_node, cur_node.left, true, res, to_delete_set);
        recursion(cur_node, cur_node.right, false, res, to_delete_set);

        if (to_delete_set.contains(cur_node.val)) {
            res.remove(cur_node.val);

            if (parent != null) {
                if (isleft) {
                    parent.left = null;
                } else {
                    parent.right = null;
                }
            }

            if (cur_node.left != null) {
                res.put(cur_node.left.val, cur_node.left);
            }
            if (cur_node.right != null) {
                res.put(cur_node.right.val, cur_node.right);
            }
        }
    }
}