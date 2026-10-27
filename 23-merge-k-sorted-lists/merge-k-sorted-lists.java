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

    public static void display(ListNode a){
        while(a!=null){
            System.out.print(a.val+" ");
            a=a.next;
        }
        System.out.println();
    }

    public static ListNode merge(ListNode a,ListNode b){

        ListNode res=null;
        ListNode res2=null;

        while(a!=null && b!=null){
            if (a.val<=b.val){
                if(res==null){
                    res=new ListNode(a.val);
                    res2=res;
                }
                else{
                    res.next=new ListNode(a.val);
                    res=res.next;
                }
                a=a.next;
            }
            else{
                if(res==null){
                    res=new ListNode(b.val);
                    res2=res;
                }
                else{
                    res.next=new ListNode(b.val);
                    res=res.next;
                }
                b=b.next;
            }
        }

        if(a!=null){
            if(res==null){
                res=a;
                res2=res;
            }
            else{
                res.next=a;
                res=res.next;
            }
        }
        
        if(b!=null){
            if(res==null){
                res=b;
                res2=res;
            }
            else{
                res.next=b;
                res=res.next;
            }
        }
        // display(res2);
        return res2;
    }

    public ListNode mergeKLists(ListNode[] lists) {
        
        ListNode res=null;

        for(int i=0;i<lists.length;i++){
            res=merge(res,lists[i]);
        }

        return res;
    }
}