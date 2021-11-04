///129. Sum Root to Leaf Numbers
//https://leetcode.com/problems/sum-root-to-leaf-numbers/submissions/

class Solution {
    public int sumNumbers(TreeNode root) {
         if (root == null) {
             return 0;
         }
 
         return sumNumbersHelper(root, 0);
     }
 
     private int sumNumbersHelper(TreeNode node, int curVal) {
         if (node == null) {
             return 0;
         }
 
         curVal = curVal * 10 + node.val;
         if (node.left == null && node.right == null) {
             return curVal;
         }
 
         return sumNumbersHelper(node.left, curVal) + sumNumbersHelper(node.right, curVal);
     }
 }