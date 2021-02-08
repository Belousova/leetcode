//56. Merge Intervals
class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length==1) return intervals;
        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));
        
        List<int[]> ans = new ArrayList<>();
        ans.add(new int[]{intervals[0][0], intervals[0][1]});
        int index = 0;
        int currentEnd = intervals[0][1];
        for (int i=0; i<intervals.length; i++){
            int[] a = new int[]{intervals[i][0], intervals[i][1]};
            if (currentEnd<a[0]) {
                index++;
                currentEnd = a[1];
                ans.add(a);
            } else if (currentEnd>=a[0] && currentEnd<a[1]) {
                currentEnd = a[1];
                ans.get(index)[1] = a[1];
            }
        }
        
        
        return ans.toArray(new int[ans.size()][]);
    }
}
