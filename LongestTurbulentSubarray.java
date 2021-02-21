//978. Longest Turbulent Subarray
class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int maxlen = 0;
        int prev_smaller = 0;
        int prev_greater = 0;
        int curr_smaller = 0;
        int curr_greater = 0;
        
        for (int i=1; i<arr.length; i++){
            curr_smaller = 0;
            curr_greater = 0;
            if (arr[i] > arr[i-1]) {
                curr_greater = prev_smaller + 1;
            }
            if (arr[i] < arr[i-1]) {
                curr_smaller = prev_greater + 1;
            }
            maxlen = Math.max(maxlen, Math.max(curr_greater, curr_smaller));
            prev_smaller = curr_smaller;
            prev_greater = curr_greater;
        }
        return maxlen+1;
    }
}
