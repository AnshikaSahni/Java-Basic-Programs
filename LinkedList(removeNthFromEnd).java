class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode i=head;
        ListNode j=head;
        int c=1;
        if(head.next==null)
        {
            return null;
        }
        while(c<n+1)
        {
            i=i.next;
            c++;
        }
        if(i==null)
        {
            head=head.next;
        }
        else
        {
            while(i.next!=null)
            {
                j=j.next;
                i=i.next;
            }
            j.next=j.next.next;
        }
        return head;
    }
}
