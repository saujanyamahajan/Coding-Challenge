package September.Day2;
import java.util.*;

//1.Trapping Rain Water 
//https://practice.geeksforgeeks.org/problems/trapping-rain-water-1587115621/1#

class Solution{
    
    static long trappingWater(int arr[], int n) { 
        // Your code 
         int[] maxl=new int[n];
         int[] maxr=new int[n];
         
          maxl[0]=arr[0];
          maxr[n-1]=arr[n-1];
         
         for(int i=1;i<n;i++){
             maxl[i]=Math.max(maxl[i-1],arr[i]);
         }
         for(int i=n-2;i>=0;i--){
             maxr[i]=Math.max(maxr[i+1],arr[i]);
         }
         int[] water=new int[n];
         for(int i=0;i<n;i++){
             water[i]=Math.min(maxl[i],maxr[i])-arr[i];
         }
         long sum=0;
         for(int i=0;i<n;i++){
             sum=sum+water[i];
         }
         return sum;
    }
    
    //2.Special Stack 
    //https://practice.geeksforgeeks.org/problems/special-stack/1#


     Stack<Integer> ss = new Stack<>();

	public void push(int a,Stack<Integer> s)
	{
	    //add code here.
	   // s.push(a);
    //         if(s.empty() || ss.peek()>=a){
    //          ss.push(a);
    //         }else{
	   //          return ;
    //         }
         s.push(a);
        if(ss.isEmpty()){
            ss.push(a);
        }else{
        if(ss.peek()>a){
            ss.push(a);
        }
        }
	}
	public int pop(Stack<Integer> s)
        {
            //add code here.
            if(s.empty()){
               return -1;
            }
            int ans=s.peek();
            s.pop();
            if(ss.peek()==ans){
                ss.pop();
            }
            return ans;
	}
	public int min(Stack<Integer> s)
        {
           //add code here.
           if(s.empty())
               return -1;
           return ss.peek();
	}
	public boolean isFull(Stack<Integer>s, int n)
        {
           //add code here.
           if(s.size()==n){
               return true;
           }else{
               return false;
           }
	}
	public boolean isEmpty(Stack<Integer>s)
        {
           //add code here.
           if(s.empty()){
               return true;
           }else{
               return false;
           }
	}

    //3.Parenthesis Checker  
    //https://practice.geeksforgeeks.org/problems/parenthesis-checker2744/1#


    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character> st = new Stack<Character>();
        for(int i=0; i<x.length();i++){  
        char c = x.charAt(i); 
            if (c == '(')
                st.push(')');
            else if (c == '{')
                st.push('}');
            else if (c == '[')
                st.push(']');
            else if (st.isEmpty() || st.pop() != c)
                return false;
            }
        return st.isEmpty();
    }


    //4.Reverse a string using Stack 
    //https://practice.geeksforgeeks.org/problems/reverse-a-string-using-stack/1

    public String reverse(String s){
        //code here
        int n=s.length();
        Stack<Character> st=new Stack<>();
        
         for(int i=0; i<n;i++){  
          st.push(s.charAt(i));
         }
         
         String res="";
         while (!st.isEmpty()){
             res=res+st.pop();
         }
                return res;
    }


    //5.implement-stack-using-queue
    //https://leetcode.com/problems/implement-stack-using-queues/submissions/
    
    private Queue<Integer> q = new LinkedList<>();


    public void push(int x) {
        q.add(x);
        for(int i=1;i<q.size();i++){
            q.add(q.remove());
        }
            
        }
    public int pop() {
            return q.remove();

    }
    
    public int top() {
       return q.peek(); 
    }
    
    public boolean empty() {
        return q.isEmpty();
    }