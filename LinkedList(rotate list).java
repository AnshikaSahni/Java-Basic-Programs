class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode tmp=head;
        ListNode t=head;
        ListNode i=head;
        ListNode j=head;
        int length=0;
        int m;
        int c=1;
       while(tmp!=null)
       {
           tmp=tmp.next;
           length++;
       }
        if(length==0)
        {
            return null;
        }
        else if(k==length)
        {
          return head; 
        }
        else if(k>length)
        {
            k=k%length;
            
        }
        while(j.next!=null)
        {
         j=j.next;
           
        }
        while(c<length-k)
         {
           i=i.next;
              c++;
        }
        j.next=head;
        head=i.next;
        i.next=null;
        
        return head;
    }
}
