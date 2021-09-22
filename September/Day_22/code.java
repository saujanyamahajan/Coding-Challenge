class Solution {

    //13. Remove Duplicates 
    //https://practice.geeksforgeeks.org/problems/remove-duplicates3034/1/?track=md-string&batchId=144


    String removeDups(String S) {
        // code here
        String str = new String();
        int len = S.length();
          
        for (int i = 0; i < len; i++) 
        {
            char c = S.charAt(i);
            if (str.indexOf(c) < 0)
            {
                str += c;
            }
        }
          
        return str;
    
    }
}