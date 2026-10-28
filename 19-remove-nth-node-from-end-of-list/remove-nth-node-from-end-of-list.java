/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head==null){
            return null;
        }
        if(head.next==null && n==1){
            return null;
        }
        head=new ListNode(0,head);
        ListNode fast=head;
        ListNode slow=head;
        ListNode slow_prev=null ;
        int fasti=1;
        int slowi=0;

        while(fast.next!=null){
            fast=fast.next;
            fasti+=1;
            // System.out.println("f: "+fast.val+" ");

            if (fasti>n && fast!=null){
                slowi+=1;
                slow_prev=slow;
                slow=slow.next;
                // System.out.println("s: "+slow.val+" ");
            }

        }
        
        if(slow_prev!=null){System.out.println(slow_prev.val+" sp");}
        if(slow!=null){System.out.println(slow.val+" s");}
        if (slow_prev!=null){
        slow_prev.next=slow.next;
        }
        else{
            slow_prev=slow.next;
            head=slow_prev;
        }



        return head.next;
    }
}