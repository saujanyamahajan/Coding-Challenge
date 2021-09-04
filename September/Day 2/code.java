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


    //6.implement-queue-using-stacks
    //https://leetcode.com/problems/implement-queue-using-stacks/
   
   
    Stack<Integer>op=new Stack();
    Stack<Integer>ip=new Stack();

    public void push(int x) {
        ip.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
     if(op.empty()){
         while(ip.empty()==false){
             op.push(ip.peek());
             ip.pop();
         }
     }   
        int x=op.peek();
        op.pop();
        return x;
    }
    
    /** Get the front element. */
    public int peek() {
           if(op.empty()){
         while(ip.empty()==false){
             op.push(ip.peek());
             ip.pop();
         }
     }   
        return op.peek();
        
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return op.empty() && ip.empty();
    }


    //6. LRU cache
    //https://leetcode.com/problems/lru-cache/submissions/

    Node head = new Node(0, 0), tail = new Node(0, 0);
  Map<Integer, Node> map = new HashMap();
  int capacity;
  
  public LRUCache(int _capacity) {
    capacity = _capacity;
    head.next = tail;
    tail.prev = head;
  }

  public int get(int key) {
    if(map.containsKey(key)) {
      Node node = map.get(key);
      remove(node);
      insert(node);
      return node.value;
    } else {
      return -1;
    }
  }

  public void put(int key, int value) {
    if(map.containsKey(key)) {
      remove(map.get(key));
    }
    if(map.size() == capacity) {
      remove(tail.prev);
    }
    insert(new Node(key, value));
  }
  
  private void remove(Node node) {
    map.remove(node.key);
    node.prev.next = node.next;
    node.next.prev = node.prev;
  }
  
  private void insert(Node node){
    map.put(node.key, node);
    node.next = head.next;
    node.next.prev = node;
    head.next = node;
    node.prev = head;
  }
  
  class Node{
    Node prev, next;
    int key, value;
    Node(int _key, int _value) {
      key = _key;
      value = _value;
    }
  }


  ///7.maxSlidingWindow
  //https://leetcode.com/problems/sliding-window-maximum/

  public int[] maxSlidingWindow(int[] a, int k) {
       
        
    int n = a.length;
           int[] r = new int[n-k+1];
           int ri = 0;
           
           Deque<Integer> q = new ArrayDeque<>();
           for (int i = 0; i < a.length; i++) {
               
               if (!q.isEmpty() && q.peek() == i - k) {
                   q.poll();
               }
               
               while (!q.isEmpty() && a[q.peekLast()] < a[i]) {
                   q.pollLast();
               }
               
               q.offer(i);
               if (i >= k - 1) {
                   r[ri++] = a[q.peek()];
               }
           }
       return r;
      
       }

       //8.the-celebrity-problem
       //https://practice.geeksforgeeks.org/problems/the-celebrity-problem/1#


       int celebrity(int a[][], int n)
       {
           // code here 
           Stack <Integer>st=new Stack<>();
           for(int i=0;i<a.length;i++)
           {
               st.push(i);
           }
           while(st.size()>=2){
               int i=st.pop();
               int j=st.pop();
               
               if(a[i][j]==1)
               
               {
                   st.push(j);
               }
               else{
                   st.push(i);
               }
           }
           int potential_cele=st.pop();
           for(int i=0;i<a.length;i++)
           {
               if(i!=potential_cele)
               {
                   if(a[i][potential_cele]==0 || a[potential_cele][i]==1)
                   {
                    return -1 ;
                   }
                }   
           }
           return potential_cele;
       }
}