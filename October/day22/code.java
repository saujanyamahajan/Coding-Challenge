package October.day22;
import java.util.*;


//1. Number of paths 
//https://practice.geeksforgeeks.org/problems/number-of-paths0926/1/?track=md-recursion&batchId=144

class Solution
{
    long numberOfPaths(int m, int n) {
        // Code Here
         if (m==1||n==1)
         {
            return 1;
         }
        return numberOfPaths(m-1,n)+numberOfPaths(m,n-1);
    }
}


//4. Tower Of Hanoi 
//https://practice.geeksforgeeks.org/problems/tower-of-hanoi-1587115621/1/?track=md-recursion&batchId=144#


class Hanoi {

    long count=0;
    
    public long toh(int n, int from, int to, int aux)
    {
        // Your code here
        if (n == 1)
        {
            System.out.println("move disk "+n+" from rod "+from+" to rod "+to);
            count++;
            return count;
        }
        
        toh(n - 1, from, aux, to);
        System.out.println("move disk "+n+" from rod "+from+" to rod "+to);
        count++;
        return toh(n - 1, aux, to, from);
        
    }
}
