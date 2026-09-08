// Last updated: 08/09/2026, 11:29:10
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
17    public List<Integer> preorderTraversal(TreeNode root) {
18        List<Integer> ans=new ArrayList<>();
19        preorder(root,ans);
20        return ans;
21    }
22    void preorder(TreeNode root,List<Integer> ans){
23        if(root==null){
24            return;
25        }
26        ans.add(root.val);
27        preorder(root.left,ans);
28        preorder(root.right,ans);
29    }
30}