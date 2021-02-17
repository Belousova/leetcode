//11. Container With Most Water
class Solution {
    public int maxArea(int[] height) {
        int ans = 0;
        int left = 0;
        int right = height.length-1;
        while (left<right) {
            int vol = Math.min(height[left],height[right])*(right-left);
            ans = Math.max(ans, vol);
            if (height[left]<height[right]){
                left++;
            } else {
                right--;
            }
        
        }
        return ans;
    }
}
