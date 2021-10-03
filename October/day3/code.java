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


        //Help the Old Man!!! 
        //https://practice.geeksforgeeks.org/problems/help-the-old-man3848/1#


        public static void solve(List<Integer> ans,int source,int helper,int destination,int disk,int n,int[] move)
        {
            if(disk == 0)
            {
                return;
            }
            solve(ans,source,destination,helper,disk-1,n,move);
            move[0]++;
            if(move[0]==n)
            {
                ans.add(source);
                ans.add(destination);
            }
            solve(ans,helper,source,destination,disk-1,n,move);
        }
        
        static List<Integer> shiftPile(int N, int n)
        {
            // code here
            List<Integer> ans=new ArrayList<>();
            int[] move=new int[]{0};
            solve(ans,1,2,3,N,n,move);
            return ans;
        }


        //Subsets
        //https://leetcode.com/problems/subsets/


        public List<List<Integer>> subsets(int[] nums) {
            Arrays.sort(nums);
            List<List<Integer>> res = new ArrayList<>();
            solve(nums, 0, new ArrayList<>(), res);
            return res;
        }
        
        private void solve(int[] nums, int idx, List<Integer> path, List<List<Integer>> res) 
            {
                res.add(path);
                for (int i = idx; i < nums.length; i++) 
                {
                    List<Integer> p = new ArrayList<>(path);
                    p.add(nums[i]);
                    solve(nums, i+1, p, res);
                }
            }

    }
    

