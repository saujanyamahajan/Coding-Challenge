class Solution {


    //4. Nth Natural Number 
    //https://practice.geeksforgeeks.org/problems/nth-natural-number/0/?track=MD-Math&batchId=144


    long findNth(long N)
    {
        //code here
    long result = 0;
 
    long p = 1;
 
    while (N > 0) {
 
      result += (p * (N % 9));
 
      N = N / 9;
 
      p = p * 10;
    }
    return result;
    }
}