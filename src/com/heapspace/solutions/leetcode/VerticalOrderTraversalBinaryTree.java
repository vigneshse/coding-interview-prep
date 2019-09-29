package com.heapspace.solutions.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class VerticalOrderTraversalBinaryTree {
    /**
     * Definition for a binary tree node.
     */
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    //Sorted map to store the node values with IDs in sorted order
    Map<Integer, List<Integer>> treeMap = new TreeMap();

    public List<List<Integer>> verticalTraversal(TreeNode root) {

        List<List<Integer>> result = new ArrayList();
        if (root == null) return result;

        //Traverse the tree and map the ids
        inOrderTraverse(root, 0);

        //Add values to result set from the sorted map
        for (int key : treeMap.keySet()) {
            result.add(treeMap.get(key));
        }

        return result;
    }

    private void inOrderTraverse(TreeNode node, int id) {
        //Base case
        if (node == null) return;

        //Recurse left subtrees
        inOrderTraverse(node.left, --id);

        //Store Result
        List<Integer> nodes = treeMap.getOrDefault(id, new ArrayList());
        nodes.add(node.val);
        treeMap.put(id, nodes);

        // Unwind the call (backtracking)
        id++;

        // Recurse right sub trees
        inOrderTraverse(node.right, ++id);
    }


}

/*  Example Binary Tree
                            1
                          /   \
                         2     3
                        / \   / \
                       4   5 6   7

    Input: [1,2,3,4,5,6,7]
    Output: [[4],[2],[1,5,6],[3],[7]]}
*/
