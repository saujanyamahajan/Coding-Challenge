class Solution
{


    //Length of String 
    //https://practice.geeksforgeeks.org/problems/length-of-string/1


    // Complete the function
    // str: input string
    public static int lengthString(String str)
    {
        // find the length of string
        int ans=str.length();
        return ans;
    }


    //The If Statement 
    //https://practice.geeksforgeeks.org/problems/the-if-statement/1


    public static void utility(int number){
        //Write your if statement below
        if(number<100)
        {
        //Write your if statement above
        System.out.println("Number");
        }
        else
        {
        System.out.println("Big");
        System.out.println("Number");
        }
    }


    //While Loop 
    //https://practice.geeksforgeeks.org/problems/while-loop/1


    public static void utility(int x){
   
        //Write your code here
        while(x>=0)
        {
            System.out.print(x+" ");
            x--;
        }
        
     }


     //Sum of Array Elements 
     //https://practice.geeksforgeeks.org/problems/sum-of-array-elements2502/1


     public static int sumElement(int arr[], int n)
     {
         // Your code here
         int sum=0;
         for(int i=0;i<n;i++)
         {
             sum=sum+arr[i];
         }
         return sum;
     }
     

     //Peak element 
     //https://practice.geeksforgeeks.org/problems/peak-element/1


     int peakElement(int arr[], int n)
        {
        // Your code here
        if (n==1)
        {
            return 0;
        }
            if (arr[0]>=arr[1])
            {
                return 0;
            }
            if (arr[n-1]>=arr[n-2])
            {
                return n-1;
            }
        
            for(int i=1; i<n-1; i++)
            {
                if (arr[i]>=arr[i-1] && arr[i]>=arr[i+1])
                {
                    return i;
                }
            }
            return 0;
        }
}