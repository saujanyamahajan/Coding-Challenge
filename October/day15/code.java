package October.day15;


//309. Best Time to Buy and Sell Stock with Cooldown
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/


class Solution {
    public int maxProfit(int[] prices)
    {
        int sell = 0, prev_sell = 0, buy = Integer.MIN_VALUE, prev_buy;
        for (int price : prices)
        {
            prev_buy = buy;
            buy = Math.max(prev_sell - price, prev_buy);
            prev_sell = sell;
            sell = Math.max(prev_buy + price, prev_sell);
        }
        return sell;
    }
}



//102. Binary Tree Level Order Traversal
//https://leetcode.com/problems/binary-tree-level-order-traversal/



class Solution2 {
    public List<List<Integer>> levelOrder(TreeNode root) 
    {
        List<List<Integer>> res = new ArrayList<>();
		if (root == null)
			return res;
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty())
        {
			int levelSize = q.size();
			List<Integer> currLevel = new ArrayList<>();
			for(int i = 0; i < levelSize; i++) 
            {
				TreeNode currNode = q.poll();
				currLevel.add(currNode.val);
				if (currNode.left != null)
					q.add(currNode.left);
				if (currNode.right != null)
					q.add(currNode.right);
			}
			res.add(currLevel);
		}
		return res;
    }
}