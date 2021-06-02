class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
         int left=0,right=0;
         int sum=0;
         ArrayList<Integer> list=new ArrayList<>();
         while(right<n||left<n)
         {   
             if(sum<s)
             {   
                 if(right==n)
                  break;
               sum+=arr[right];
               right++;
             }
             else if(sum>s)
             {   
                 sum-=arr[left];
                 left++;
             }
             else if(left==right&&right<n)
             {
                 right++;
             }
             if(sum==s)
             {
                 list.add(left+1);
                 list.add(right);
                 return list;
             }
            
         }
        
         list.add(-1);
         return list;
    } 
            
}
