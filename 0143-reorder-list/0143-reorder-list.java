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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null){
            return;
        }

        ListNode s=head;
        ListNode f=head;
        ListNode prev=null;

        while(f!=null && f.next!=null){
            prev=s;
            s=s.next;
            f=f.next.next;
        }

        //for odd no of nodes
        if(f!=null){
            prev=s;
            s=s.next;
        }
        prev.next=null;

        ListNode sh=reverse(s);
        ListNode fh=head;

        while(sh!=null){
            ListNode temp=fh.next;
            ListNode temp1=sh.next;
            fh.next=sh;
            sh.next=temp;
            sh=temp1;
            fh=temp;
        }

    }
    private ListNode reverse(ListNode head){
        ListNode prev=null;
        while(head!=null){
            ListNode next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;
    }
}