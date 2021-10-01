package October.day1;

import java.util.*;
public class code {
    

    //Print 1 to n using Recursion
    //https://practice.geeksforgeeks.org/problems/print-1-to-n-without-using-loops3621/1


        static void printTillN(int n){
            // code here
            
            if(n<1)
            {
                return;
            }
            printTillN(n-1);
            System.out.print(n+" ");
            
        }


        //Sort a stack 
        //https://practice.geeksforgeeks.org/problems/sort-a-stack/1


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
	
	public Stack<Integer> sort(Stack<Integer> s)
	{
		//add code here.
		if(s.size()==1)
		{
		    return s;
		}
		int x=s.pop();
		sort(s);
		sortedInsert(s,x);

        return  s;
	}
}
