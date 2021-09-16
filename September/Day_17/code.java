package September.Day_17;
import java.util.*;
public class code {
    

    //8. Plus One 
    //https://practice.geeksforgeeks.org/problems/plus-one/0/?track=md-arrays&batchId=144#


    static ArrayList<Integer> increment(ArrayList<Integer> arr , int n) 
    {
        // code here
             // ArrayList<Integer> ans=new ArrayList<Integer>();
              int i = n-1;
              while(i>=0){
                  if (arr.get(i)== 9) 
                  {
                    arr.set(i,0); 
                  }
                  else{
                    arr.set(i, arr.get(i) + 1);
                    
                    return arr;
                  }
                  i--;
              }
             
              //ArrayList<Integer> res =new ArrayList<Integer>();
              arr.add(0,1);
              return arr ;
         
        
    }
}
