//349. Intersection of Two Arrays
/** Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.
**/
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Set<Integer> res = new HashSet<>();
        int n1 = 0;
        int n2 = 0;
        while (n1 < nums1.length && n2 < nums2.length) {
            int a = nums1[n1];
            int b = nums2[n2];
            if (a == b) {
                if (!res.contains(a)) {
                    res.add(a);
                }
                n1++;
                n2++;
            } else if (a > b) {
                n2 ++;
            } else {
                n1 ++;
            }
        }
        int[] arr = new int[res.size()];
        int k = 0;
        for (int i : res) {
            arr[k++] = i;
        }
        return arr;
    }  
}
