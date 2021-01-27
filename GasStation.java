//134. Gas Station
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int curr = 0;
        int total = 0;
        int startidx = 0;
        for (int i=0; i<gas.length; i++){
            curr += gas[i] - cost[i];
            if (curr<0) {
                curr = 0;
                startidx = i+1;
            }
            total += gas[i] - cost[i];
        }
        if (total<0) return -1;
        return startidx;


    }
}