// Last updated: 08/09/2026, 12:25:47
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public int minDepth(TreeNode root) {
18        if(root==null){
19            return 0;
20        }
21        int l=minDepth(root.left);
22        int r=minDepth(root.right);
23        if(l==0 && r!=0) return r+1;
24        if(l!=0 && r==0) return l+1;
25        return Math.min(r,l)+1;
26    }
27}