public class code {
    

    //Print 1 to n using Recursion
    //https://practice.geeksforgeeks.org/problems/print-1-to-n-without-using-loops3621/1


    class Solution{
        static void printTillN(int n){
            // code here
            
            if(n<1)
            {
                return;
            }
            printTillN(n-1);
            System.out.print(n+" ");
            
        }
}
