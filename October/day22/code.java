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


