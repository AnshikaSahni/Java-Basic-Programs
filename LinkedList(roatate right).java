class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode tmp=head;
        ListNode t=head;
        ListNode i=head;
        ListNode j=head;
        ListNode temp=head;
        int length=0;
        int m;
        int c=1;
       while(tmp!=null)
       {    
           j=tmp;
           tmp=tmp.next;
           length++;
       }
   
        if(k==length||length==0)
        {
          return head; 
        }
        else if(k>length)
        {
            k=k%length;
            
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
