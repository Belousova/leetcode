//1710. Maximum Units on a Truck
class Solution {

    public int maximumUnits(int[][] boxTypes, int truckSize) {

        int[] countUnits = new int[1001];
        for (int i=0; i<boxTypes.length; i++){
            countUnits[boxTypes[i][1]] += boxTypes[i][0];
        }

        int res = 0;

        for (int i = countUnits.length-1; i>0; i--){
            if (truckSize > countUnits[i]) {
                res += countUnits[i]*i;
                truckSize-= countUnits[i];
            } else {
                res += truckSize * i;
                return res;
            }
        }
        return res;
    }
}