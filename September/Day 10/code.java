package September.Day 10;

public class code {
    

//1.Level order traversal in spiral form
//https://practice.geeksforgeeks.org/problems/level-order-traversal-in-spiral-form/1#


    ArrayList<Integer> findSpiral(Node root) 
    {
       ArrayList<Integer> ls=new ArrayList<>();
        if(root==null) return ls;
        Stack<Node> s1= new Stack<>();
        Stack<Node> s2= new Stack<>();
        s1.push(root);
        while(!s1.isEmpty()||!s2.isEmpty())
        {
            while(!s1.isEmpty())
            {
                Node temp=s1.pop();
                ls.add(temp.data);
                if(temp.right!=null) s2.push(temp.right);
                if(temp.left!=null) s2.push(temp.left);
            }
            while(!s2.isEmpty())
            {
                Node temp= s2.pop();
                ls.add(temp.data);
                if(temp.left!=null) s1.push(temp.left);
                if(temp.right!=null) s1.push(temp.right);
            }
        }
        return ls;
}
}

