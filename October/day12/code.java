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