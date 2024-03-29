/*
LOGIC
- Keep 2 pointer left and right
- Find max left height and max right height 
- Choose the min of 2 heights and subtract from current height to find water at ith level
- keep adding it to result
*/
class Solution {
    public int trap(int[] height) {
        int max_left = 0;
        int max_right = 0;           
        int left = 0;
        int right = height.length-1;
        int ans = 0;
        while(left<=right)
        {           
            max_left = Math.max(max_left,height[left]);                      
            max_right = Math.max(max_right, height[right]);            
            if(max_left < max_right)
            {
                ans+= max_left - height[left];
                left++;
            }
            else
            {
                ans+= max_right - height[right];
                right--;
            }                       
        }
        return ans;
    }
}
