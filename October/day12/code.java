package October.day12;

//83. Remove Duplicates from Sorted List
//https://leetcode.com/problems/remove-duplicates-from-sorted-list/

class Solution {
public ListNode deleteDuplicates(ListNode head) 
{
    if(head==null || head.next==null)
    {
        return head;
    }
    head.next=deleteDuplicates(head.next);
    return head.val==head.next.val?head.next:head;
}
}


//206. Reverse Linked List
//https://leetcode.com/problems/reverse-linked-list/


class Solution2 {
    public ListNode reverseList(ListNode head) {
        
        ListNode dummy=null;
        
        while(head!=null)
        {
            ListNode node=head.next;
            head.next=dummy;
            dummy =head;
            head=node;
        }
        return dummy;
    }
}


//374. Guess Number Higher or Lower
//https://leetcode.com/problems/guess-number-higher-or-lower/

public class solution5 extends GuessGame
{
    public int guessNumber(int n)
    {
     int lo=1;
     int hi=n;
     
     while(lo<=hi)
     {
     int mid=lo+(hi-lo)/2;
    
     if(guess(mid)==0)
     {
        //pick==mid
        return mid;
     }
     else if(guess(mid)==-1)
     {
        //pick<mid
        hi=mid-1;
     }
     else if(guess(mid)==1)
     {
        //pick>mid
        lo=mid+1;
     }
     }
     return -1;
    }
}