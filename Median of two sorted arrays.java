import java.util.*;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer>list=new ArrayList<>();
        int m=0;
        for(int i=0;i<nums1.length;i++)
        {
            list.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++)
        {
            list.add(nums2[i]);
        }
        int n=list.size();
        Collections.sort(list);
        if(n%2==0)
        {   
             double z=(float)(list.get(n/2-1)+list.get(((n+2)/2)-1))/2;
            return z;
        }
        else
        {
            double y=(float)list.get((n-1)/2);
            return y;
        }
    }        
  }
