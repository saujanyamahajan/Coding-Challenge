package October.day4;

public class code {


    //206. Reverse Linked List
    //https://leetcode.com/problems/reverse-linked-list/


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

