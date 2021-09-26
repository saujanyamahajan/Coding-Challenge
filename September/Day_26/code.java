class Solution{


    //15. Check if string is rotated by two places 
    //https://practice.geeksforgeeks.org/problems/check-if-string-is-rotated-by-two-places-1587115620/1/?track=md-string&batchId=144


public static boolean isRotated(String str1, String str2)
{
    // Your code here
    if (str1.length()!=str2.length())
    {
        return false;
    }
    if(str1.length()<2)
    {
        return str1.equals(str2);
    }
  
    String clock_rot="";
    String anticlock_rot="";
    int len=str2.length();
    
    anticlock_rot=anticlock_rot+str2.substring(len-2, len)+str2.substring(0, len-2);
    
    clock_rot=clock_rot+str2.substring(2)+str2.substring(0, 2);
    
    return (str1.equals(clock_rot)||str1.equals(anticlock_rot));
}


//16. Permutations of a given string 
//https://practice.geeksforgeeks.org/problems/permutations-of-a-given-string2041/1/?track=md-string&batchId=144#

public List<String> find_permutation(String S)
    {
        // Code here
        int k=S.length();
        int per=1;
        while(k>0){
           per*=k;
           k--;
        }
        char[] array = S.toCharArray();
        ArrayList<Character> charList = new ArrayList<>();
        for(int i=0;i<array.length;i++){
            charList.add(array[i]);
        }
        ArrayList<String> stringList=new ArrayList<>();
        stringList.add(S);
        while(stringList.size()!=per){
    		Collections.shuffle(charList);
    		for(int i=0;i<charList.size();i++){
    		    array[i]=charList.get(i);
    		}
            String a=String.valueOf(array);
            int flag=0;
            int i=0;
            while(flag==0 && i<stringList.size()){
                if((stringList.get(i)).equals(a)){
                    flag=1;
                    break;
                }
                else{
                    i++;
                }
            }
            if(flag==0){
                stringList.add(a);
            }
        }
        Collections.sort(stringList);
        return stringList;
}