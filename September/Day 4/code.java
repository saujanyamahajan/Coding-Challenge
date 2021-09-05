package September.Day 4;

import java.util.*;
class solution{
//1.Rotate Array
//https://practice.geeksforgeeks.org/problems/rotate-array-by-n-elements-1587115621/1/?track=md-arrays&batchId=144#
static void reverse(int a[], int i, int j)
{
    while(j>i)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
        i++;
        j--;
    }    
}
static void rotateArr(int a[], int d, int n)
{
    // add your code here
    
    reverse(a,0,d-1);
    reverse(a,d,a.length-1);
    reverse(a,0,a.length-1);
}

}