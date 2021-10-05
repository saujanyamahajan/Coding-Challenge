package October.day5;
public code
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
    
}