package September.Day_30;

public class code {


    //Count Digits 
    //https://practice.geeksforgeeks.org/problems/count-digits-1606889545/1


    public static void countDigits(int n){

        //write your code here
        //print number of digits in n
        
            int count=0;
            while(n!=0)
            {
               int rem=n%10;
               n=n/10;
               count+=1;
            }
               System.out.print(count);
    }
}
