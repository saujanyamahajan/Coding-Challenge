//46. Permutations
//https://leetcode.com/problems/permutations/


class Solution {
    public List<List<Integer>> permute(int[] nums)
    {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ds =new ArrayList<>();
        boolean freq[]=new boolean[nums.length];
        helper(nums, ds,ans,freq);
        return ans;
    }
    public void helper(int[] nums,List<Integer> ds,List<List<Integer>> ans,boolean[] freq)
    {
        if(ds.size()==nums.length)
        {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(!freq[i])
            {
                freq[i]=true;
                ds.add(nums[i]);
                helper(nums,ds,ans,freq);
                ds.remove(ds.size()-1);
                freq[i]=false;
            }
        }
    }
    
}

//60. Permutation Sequence
//https://leetcode.com/problems/permutation-sequence/



class Solution {
    public String getPermutation(int n, int k) {
        
        int fact = 1; 
        List<Integer> numbers = new ArrayList<>(); 
        for(int i = 1;i<n;i++) {
            fact = fact * i; 
            numbers.add(i); 
        }
        numbers.add(n); 
        String ans = ""; 
        k = k - 1; 
        while(true) {
            ans = ans + numbers.get(k / fact); 
            numbers.remove(k / fact); 
            if(numbers.size() == 0) {
                break; 
            }
            
            k = k % fact; 
            fact = fact / numbers.size();
        }
        return ans; 
    }
}

