//134. Gas Station
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int[] diff = new int[gas.length];
        int curr = 0;
        for (int i=0; i<diff.length; i++){
            diff[i] = gas[i] - cost[i];
            curr += diff[i];
        }
        if (curr<0) return -1;

        int startidx = 0;
        curr = 0;
        for (int i =0; i<diff.length; i++) {
            curr+=diff[i];
            while (curr<0 && startidx<=i) {
                curr-=diff[startidx];
                startidx++;
            }
        }
        return startidx;
    }
}