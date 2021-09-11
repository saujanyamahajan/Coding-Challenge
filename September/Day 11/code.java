

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



    //2.Boundary Traversal of binary tree 
    //https://practice.geeksforgeeks.org/problems/boundary-traversal-of-binary-tree/1


    Boolean isLeaf(Node root)
	{
	    return (root.left==null) && (root.right==null)  ;
	}
	void addLeft(Node root,ArrayList<Integer>ans)
	{
	    Node curr=root.left;
	    while(curr!=null)
	    {
	        if(isLeaf(curr)==false)
	        {
	            ans.add(curr.data);
	        }   
	        if(curr.left!=null)
	        {
	            curr=curr.left;
	        }   
	        else
	        {
	            curr=curr.right;
	        }   
	    }
	}
	void addRight(Node root,ArrayList<Integer>ans)
	{
	    Node curr=root.right;
        ArrayList<Integer> temp=new ArrayList<>();
	    while(curr!=null)
	    {
	        if(isLeaf(curr)==false)
	        {
	            temp.add(curr.data);
	        }   
	        if(curr.right!=null)
	        {
	            curr=curr.right;
	        }   
	        else
	        {
	            curr=curr.left;
	        }   
	    } 
	    for(int i=temp.size()-1;i>=0;--i)
	    {
	        ans.add(temp.get(i));
	    }
	}
	void addLeaf(Node root,ArrayList<Integer>ans)
	{
	    if(isLeaf(root))
	    {
	        ans.add(root.data);
	        return;
	    }    
	    if(root.left!=null){
	        addLeaf(root.left,ans);
	    }    
	    if(root.right!=null){
	        addLeaf(root.right,ans);
	    }    
	        
	}
	ArrayList <Integer> printBoundary(Node node)
	{
        ArrayList<Integer> ans=new ArrayList<>();
        if(isLeaf(node)==false){
            ans.add(node.data);
        }
        addLeft(node,ans);
        addLeaf(node,ans);
        addRight(node,ans);
        return ans;
        
	}
}