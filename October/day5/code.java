package October.day5;
public class code
{

//Permutation with Spaces 
//https://practice.geeksforgeeks.org/problems/permutation-with-spaces3627/1#

    void solve(String ip,String op,ArrayList<String>res)
    {
         if(ip.length()==0)
         {
             res.add(op);
             return;
         }
         String op1=op;
         String op2=op;
         
         op1=op1+ip.charAt(0);
         op2=op2+" "+ip.charAt(0);
         
         ip=ip.substring(1);
         solve(ip,op1,res);
         solve(ip,op2,res);
         return;
         
    }
    ArrayList<String> permutation(String S){
        // Code 
        ArrayList<String> res=new ArrayList<>();
        String ip=S.substring(0,S.length());
        String op=S.substring(0,1);
        
        ip=ip.substring(1);
        solve(ip,op,res);
        Collections.sort(res);
        return res;        
    }


    //784. Letter Case Permutation
    //https://leetcode.com/problems/letter-case-permutation/

    List<String> res;
    public List<String> letterCasePermutation(String s)
    {
        res = new ArrayList<>();
        solve(s,"",0);
        //Collections.sort(res);
        return res;
    }
    public void solve(String ip,String op,int n)
    {
        if(ip.length()==n)
        {
            res.add(op);
            return;
        }
        String op1=new String(op);
        String op2=new String(op);
        char c=ip.charAt(n);
        
        if(Character.isAlphabetic(c))
        {
            op1=op1+c;
            
//             char ch=Character.toUpperCase(c);
//             op2=op2+ch;
            
            c ^= (1 << 5); // converts lower-case to upper and upper to lower
            op2=op2+c;

            solve(ip,op1,n+1);
            solve(ip,op2,n+1);
        }
        else
        {
            op1=op1+c;
            solve(ip,op1,n+1);
        }

        return;
    }

    //70. Climbing Stairs
    //https://leetcode.com/problems/climbing-stairs/


    public int climbStairs(int n) {
        int[] dp=new int[n+1];
         dp[0]=1;
         dp[1]=1;
        for(int i=2;i<=n;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
   

//217. Contains Duplicate
//https://leetcode.com/problems/contains-duplicate/


    public boolean containsDuplicate(int[] arr) {
        
        HashMap<Integer,Integer>map=new HashMap<>();
        
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        
        for(int i=0;i<arr.length;i++)
        {
            if( map.get(arr[i])>1)
            {
                return true;
            }
        }
        return false;
        
//   
//         HashSet<Integer> set=new HashSet<>();
//         for(int i=0;i<arr.length;i++)
//         {
//             if(set.contains(arr[i]))
//             {
//                 return true;
//             }
//             else
//             {
//                 set.add(arr[i]);
//             }
//         }
//         return false;
        
    }
}