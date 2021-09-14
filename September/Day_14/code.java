package September.Day_14;

public class code
{



    //1. Sort an array of 0s, 1s and 2s 
    //https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1/?track=md-arrays&batchId=144


    public static void swap(int a[], int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
        
    }
    public static void sort012(int a[], int n)
    {
        // code here 
        int i=0;
        int j=0;
        int k=n-1;
        while(i<=k)
        {
            if(a[i]==0)
            {
                swap(a,i,j);
                i++;
                j++;
            }
            else if(a[i]==1){
                i++;
            }
            else{
                swap(a,i,k);
                k--;
            }
        }
    }
}
