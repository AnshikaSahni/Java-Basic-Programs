class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode j= head;
        ListNode i=null;
        ListNode k=null;
        if(head==null||head.next==null)
        {
            return head;
        }
        else
        {
            while(j!=null)
            {
                k=j.next;
                j.next=i;
                i=j;
                j=k;
                
            }
            head=i;
                                                            
        }
        return head;
    }
}
