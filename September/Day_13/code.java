package September.Day_13;
import java.util.*;
public class code {
    
//1.Top View of Binary Tree 
//https://practice.geeksforgeeks.org/problems/top-view-of-binary-tree/1#

public class Node {
    Node left;
    Node right;
    int data;
}

    public class Pair {
  
        // Node temp;
         int lineNo;
         Node node;
         
         public Pair(Node _node,int _lineNo) {
         
             node= _node;
             lineNo=_lineNo;
            // left=right=null;
         }
     }
     
    
         //Function to return a list of nodes visible from the top view 
         //from left to right in Binary Tree.
         static ArrayList<Integer> topView(Node root)
         {
             // add your code
             ArrayList<Integer> ans=new ArrayList<>();
             if(root==null)
             {
                 return ans;
             }
             Map<Integer,Integer>map=new TreeMap<>();
             Queue<Pair>q=new LinkedList<>();
             q.add(new Pair(root,0));
             while(!q.isEmpty()){
                 Pair top=q.remove();
                 int lineNo =top.lineNo;
                 Node temp=top.node;
                 
                 if(map.get(lineNo)==null){
                     map.put(lineNo,temp.data);
                 }
                 
                 if(temp.left!=null){
                     q.add(new Pair(temp.left,lineNo-1));
                 }
                 if(temp.right!=null){
                     q.add(new Pair(temp.right,lineNo+1));
                 }
             }
             for(Map.Entry<Integer,Integer>ele:map.entrySet()){
                 ans.add(ele.getValue());
             }
             return ans;
         }


         
     }

