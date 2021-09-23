class Solution 
{

    //1. Reverse words in a given string 
    //https://practice.geeksforgeeks.org/problems/reverse-words-in-a-given-string5459/1/?track=md-string&batchId=144#


    //Function to reverse words in a given string.
    String reverseWords(String s)
    {
        // code here 
    String[] words = s.split("\\.");
    //int n=words.length;
	String reversedString = "";
	
     for (int i = words.length - 1; i >= 0; i--)
     { 
        reversedString += words[i] ; 
        
        if(i>=1)
        {
            reversedString=reversedString+".";
        }
     }
	return reversedString;
    }


}