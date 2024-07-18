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
    public void makeGraph(TreeNode root, TreeNode prev, Map<TreeNode, List<TreeNode>> adj, Set<TreeNode> leafNodes) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) { // Leaf node
            leafNodes.add(root);
        }

        if (prev != null) {
            adj.computeIfAbsent(root, k -> new ArrayList<>()).add(prev);
            adj.computeIfAbsent(prev, k -> new ArrayList<>()).add(root);
        }

        makeGraph(root.left, root, adj, leafNodes);
        makeGraph(root.right, root, adj, leafNodes);
    }

    public int countPairs(TreeNode root, int distance) {
        Map<TreeNode, List<TreeNode>> adj = new HashMap<>(); // Graph
        Set<TreeNode> leafNodes = new HashSet<>(); // Leaf nodes

        makeGraph(root, null, adj, leafNodes);

        int count = 0; // Count of good node pairs

        for (TreeNode leaf : leafNodes) {
            // Perform BFS and see if you can find other leaf nodes within distance
            Queue<TreeNode> queue = new LinkedList<>();
            Set<TreeNode> visited = new HashSet<>();
            queue.add(leaf);
            visited.add(leaf);

            for (int level = 0; level <= distance; level++) { // Only go till level <= distance
                int size = queue.size();
                while (size-- > 0) { // Process level
                    TreeNode curr = queue.poll();

                    if (curr != leaf && leafNodes.contains(curr)) {
                        count++;
                    }

                    for (TreeNode neighbor : adj.getOrDefault(curr, new ArrayList<>())) {
                        if (!visited.contains(neighbor)) {
                            queue.add(neighbor);
                            visited.add(neighbor);
                        }
                    }
                }
            }
        }
        return count / 2;
    }
}


// class Solution {
//     public int countPairs(TreeNode root, int distance) {
//         Map<TreeNode, List<TreeNode>> map = new HashMap<>();
//         List<TreeNode> leaves = new ArrayList<>();
//         findLeaves(root, new ArrayList<>(), leaves, map);
//         int res = 0;
//         for (int i = 0; i < leaves.size(); i++) {
//             for (int j = i + 1; j < leaves.size(); j++) {
//                 List<TreeNode> list_i = map.get(leaves.get(i));
//                 List<TreeNode> list_j = map.get(leaves.get(j));
//                 for (int k = 0; k < Math.min(list_i.size(), list_j.size()); k++) {
//                     if (list_i.get(k) != list_j.get(k)) {
//                         int dist = list_i.size() - k + list_j.size() - k;
//                         if (dist <= distance) res++;
//                         break;
//                     }
//                 }
//             }
//         }
//         return res;
//     }

//     private void findLeaves(TreeNode node, List<TreeNode> trail, List<TreeNode> leaves, Map<TreeNode, List<TreeNode>> map) {
//         if (node == null) return;
//         List<TreeNode> tmp = new ArrayList<>(trail);
//         tmp.add(node);
//         if (node.left == null && node.right == null) {
//             map.put(node, tmp);
//             leaves.add(node);
//             return;
//         }
//         findLeaves(node.left, tmp, leaves, map);
//         findLeaves(node.right, tmp, leaves, map);
//     }
// }