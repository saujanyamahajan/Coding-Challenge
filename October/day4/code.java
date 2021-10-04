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



        //key Pair
        //https://practice.geeksforgeeks.org/problems/key-pair1554/1/?track=md-hashing&batchId=144#


        public boolean keypair(int[] A, int N, int X)
    {
        // code here
        // int sum=0;
        // HashSet<Integer> set=new HashSet<>();
        // for(int i=0;i<arr.length;i++)
        // {
        //     sum=X-arr[i];
             
        //     if(set.contains(sum))
        //     {
        //         return true;
        //     }
        // }
        // return false;
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<N; i++)
        {
            if(map.containsKey(X-A[i]))
            {
                return true;
            }
            map.put(A[i], i);
        }
        return false;
    }
    } 

