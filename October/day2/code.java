package October.day1;

import java.util.*;
public class code
 {

    //Delete Middle Element of a Stack
//https://www.youtube.com/watch?v=oCcUNRMl7dA&list=PL_z_8CaSLPWeT1ffjiImo0sYTcnLzo-wY&index=8
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

 }
    
