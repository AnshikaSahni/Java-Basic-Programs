class Solution {
    public int maxArea(int[] height) {
     int i=0;
     int j=height.length-1;
     int totalarea=0;
     int area=0;
     while(i<j)
     {
         totalarea=(j-i)*Math.min(height[i],height[j]);
         area=Math.max(totalarea,area);
         if(height[i]<height[j])
         {
             i++;
         }
         else
         {
             j--;
         }
     }
        return area;
         
    }
}
