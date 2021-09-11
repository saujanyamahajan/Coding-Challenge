

class Solution {

    // 1. Binary Tree Zigzag Level Order Traversal
    //https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/submissions/


    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> ans=new LinkedList<>();
        
        if(root==null){
            return ans;
        }
        q.offer(root);
        boolean flag =true;
        while(!q.isEmpty()){
            int levelnum=q.size();
            List<Integer> subAns = new ArrayList<Integer>(levelnum);
            for(int i=0;i<levelnum;i++){
                if(q.peek().left!=null){
                    q.offer(q.peek().left);
                }
                if(q.peek().right!=null){
                    q.offer(q.peek().right);
                }
                if(flag==true){
                    subAns.add(q.poll().val) ;
                }
                else{
                    subAns.add(0, q.poll().val);
                }
            }
            flag=!flag;
            ans.add(subAns);
        }
        return ans;
    }
}