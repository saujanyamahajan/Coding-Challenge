package October.day3;

public class code {
    
    
    //2. Find duplicates in an array 
    //https://practice.geeksforgeeks.org/problems/find-duplicates-in-an-array/1/?track=PG-ArraysandSearching&batchId=457#


        public static ArrayList<Integer> duplicates(int arr[], int n) {
            // code here
             ArrayList<Integer> res=new ArrayList<>();
            
            // int[] freqArr=new int[n];
            // for(int i=0;i<n;i++)
            // {
            //     freqArr[arr[i]]++;
            // }
                
            // for(int i=0;i<n;i++)
            // {
            //     if(freqArr[i]>1)
            //     {
            //         res.add(i);
            //     }
            // }
            // if(res.size()==0)
            // {
            //     res.add(-1);
            // }
            
            // return res;
            
            HashMap<Integer,Integer> map=new HashMap<>();
            
            for(int i=0;i<n;i++)
            {
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            }
            // 3 2
            //4 3
            //5 1
            for(int i=0;i<n;i++)
            {
                if( map.get(arr[i])!=null && map.get(arr[i])>1)
                {
                    res.add(arr[i]);
                    map.remove(arr[i]);
                }
            }
            if(res.size()==0)
            {
                res.add(-1);
            }
            
            return res;
        }
    }
    

