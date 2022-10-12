//2433. Find The Original Array of Prefix Xor
class Solution {
    public int[] findArray(int[] pref) {
    
        int[] arr = new int[pref.length];
        arr[0] = pref[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = pref[i-1] ^ pref[i];
        }
        return arr;
    }
}
