

///Vertical Order Traversal of a Binary Tree
///https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/submissions/


//tree node
class Tuple{
    TreeNode node;
    int row;
    int col;
    

    //constructor
    public Tuple(TreeNode _node,int _row,int _col){
        node=_node;
        row=_row;
        col=_col;
    }
}


class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
    
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>>map=new TreeMap<>();
        Queue<Tuple> q=new LinkedList<>();
        q.offer(new Tuple(root,0,0));
        
        while(!q.isEmpty()){
            Tuple tuple=q.poll();
            TreeNode node=tuple.node;
            int x=tuple.row;
            int y=tuple.col;
            
            if(!map.containsKey(x)){
                map.put(x,new TreeMap<>());
            }
             if(!map.get(x).containsKey(y)){
                map.get(x).put(y,new PriorityQueue<>());
            }
            map.get(x).get(y).offer(node.val);
            
             if(node.left!=null){
                q.offer(new Tuple(node.left,x-1,y+1));
            }
            if(node.right !=null){
                q.offer(new Tuple(node.right,x+1,y+1));
            }
        }
        List<List<Integer>> ans=new ArrayList<>();
        for(TreeMap<Integer,PriorityQueue<Integer>> ele:map.values()){
            ans.add(new ArrayList<>());
            for(PriorityQueue<Integer> nodes:ele.values()){
                while(!nodes.isEmpty()){
                    System.out.println(nodes.peek());
                    ans.get(ans.size()-1).add(nodes.poll());
                }
            }
        }
        return ans;
    }


    //2.Check if Linked List is Palindrome 
    //https://practice.geeksforgeeks.org/problems/top-view-of-binary-tree/1#


    Node reverseList(Node head){
        Node pre=null;
        Node next=null;
        while(head!=null){
            next=head.next;
            head.next=pre;
            pre=head;
            head=next;
        }
        return pre;
    }
    boolean isPalindrome(Node head) 
    {
        //Your code here
        if(head==null||head.next==null){
            return true;
        }
        Node slow=head;
        Node fast=head;
        
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        slow.next=reverseList(slow.next);
        slow=slow.next;
        
        while(slow!=null){
            if(head.data!=slow.data){
                return false;
            }
            head=head.next;
            slow=slow.next;
        }
        return true;
    }    



//3. rotate a linked list
//https://practice.geeksforgeeks.org/problems/rotate-a-linked-list/1

    public Node rotate(Node head, int k) {
        // add code here
        if(head==null || head.next==null || k==0)
        {
            return head;
        }
        
        Node curr=head;
        int len=1;
        
        while(curr.next!=null)
        {
            len++;
            curr=curr.next;
        }
        
        curr.next=head;
        
        while(k-->0)
        {
            curr=curr.next;
            head=curr.next;
        }
        curr.next=null;
        
        return head;
    }
}