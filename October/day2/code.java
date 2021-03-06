package October.day2;

import java.util.*;
public class code
 {

    //Delete Middle Element of a Stack
//https://www.youtube.com/watch?v=oCcUNRMl7dA&list=PL_z_8CaSLPWeT1ffjiImo0sYTcnLzo-wY&index=8
//https://practice.geeksforgeeks.org/problems/sort-a-stack/1
        public void solve(Stack<Integer> s,int k)
        {
            if (s.isEmpty()||k==1)
            {
                s.pop();
                return;
            }
     
            int temp=s.pop();
            solve(s, k-1);
     
            s.push(temp);
        }
        
        public Stack<Integer> midDelete(Stack<Integer> s)
        {
            //add code here.
            if(s.size()==0)
            {
                return s;
            }
            int y=s.size();
            int k=y/2+1;
            
            solve(s,k);
    
            return  s;
        }



        //Reverse a Stack using Recursion
        //https://www.youtube.com/watch?v=8YXQ68oHjAs&list=PL_z_8CaSLPWeT1ffjiImo0sYTcnLzo-wY&index=9



        public void sortedInsert(Stack<Integer> s,int x)
        {
            if (s.isEmpty()||x > s.peek())
            {
                s.push(x);
                return;
            }
     
            int temp=s.pop();
            sortedInsert(s, x);
     
            s.push(temp);
        }
        
   
        
        public Stack<Integer> reverse(Stack<Integer> s)
        {
            //add code here.
            if(s.size()==1)
            {
                return s;
            }
            int x=s.pop();
    
            reverse(s);
            sortedInsert(s, x);
    
    
            return  s;
        }
        

        //779. K-th Symbol in Grammar
        //https://leetcode.com/problems/k-th-symbol-in-grammar/

        public int kthGrammar(int n, int k) {
            if(n == 1 && k == 1) return 0;
    
            int len=(int)Math.pow(2,n-2);
            
            //int mid=len/2;
            if(k<=len)
            {
                 return kthGrammar(n-1,k);
            
            }
            else
            {
                return kthGrammar(n-1,k-len)^1;
                
                
            }
        }
 }
    
