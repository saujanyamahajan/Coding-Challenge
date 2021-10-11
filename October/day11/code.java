package October.day11;

import java.util.*;

//Merge two sorted linked lists 
//https://practice.geeksforgeeks.org/problems/merge-two-sorted-linked-lists/1#

class LinkedList
{
    //Function to merge two sorted linked list.
    Node sortedMerge(Node head1, Node head2) {
     // This is a "method-only" submission. 
     // You only need to complete this method
     Node dummy=new Node(0);
     Node res=dummy;
     while(head1!=null && head2!=null)
     {
         if(head1.data>=head2.data)
         {
            res.next=head2;
            head2=head2.next;

         }
         else
         {
            res.next=head1;
            head1=head1.next;

         }
        res =res.next;

     }
     while(head1!=null )
     {
         res.next=head1;
         head1=head1.next;
         res =res.next;

     }
     while(head2!=null )
     {
        res.next=head2;
        head2=head2.next;
        res =res.next;

     }
     return dummy.next;

   } 
}



//RECURSIVE SOLUTION
//21. Merge Two Sorted Lists
//https://leetcode.com/problems/merge-two-sorted-lists/


class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l2==null)
        {
            return l1;
        }
        if(l1==null)
        {
           return l2; 
        }
        
        ListNode res;
        if(l1.val>l2.val)
        {
            res=l2;
            res.next=mergeTwoLists(l1,l2.next);
        }
        else
        {
            res=l1;
            res.next=mergeTwoLists(l1.next,l2);
        }
        
        return res;
    }
}




//141. Linked List Cycle
//https://leetcode.com/problems/linked-list-cycle/


class Solution3{
    public boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        
        if(head==null || head.next==null)
        {
            return false;
        }
        
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                return true;
            }
        }
        return false;
    }
}



//Remove Linked List Elements
//https://leetcode.com/problems/remove-linked-list-elements/


class Solution4 {
    public ListNode removeElements(ListNode head, int val)
    {
        if(head==null)
        {
            return null;
        }
        head.next=removeElements(head.next,val);
        return head.val==val? head.next:head ;
    }
}