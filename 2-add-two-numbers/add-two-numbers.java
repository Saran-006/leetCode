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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int remainder=0;
        ListNode result=null;
        ListNode result2=null;
        
        while (l1!=null || l2!=null){
            int a=0;
            int b=0;
            if(l1!=null){
                a=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                b=l2.val;
                l2=l2.next;
            }
            int temp=(a+b+remainder)/10;
            int rval=(a+b+remainder)%10;
            remainder=temp;
            System.out.println(rval+" "+remainder+" "+a+" "+b);
            if (result==null){
                result=new ListNode();
                result.val=rval;
                result2=result;
            }
            else{
                result.next=new ListNode();
                result=result.next;
                result.val=rval;
            }
        }

        if(remainder!=0){
            result.next=new ListNode();
            result=result.next;
            result.val=remainder;
        }

        return result2;
    }
}