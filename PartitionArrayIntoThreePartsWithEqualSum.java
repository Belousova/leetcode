//1013. Partition Array Into Three Parts With Equal Sum 
class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for (int a : arr) {
            sum += a;
        }
        
        if (sum%3!=0) return false;
        sum = sum/3;

        int n=0;
        int i=0;
        int part = 0;
        while (i<arr.length) {
            part += arr[i];
            if (part==sum) {
                n++;
                part=0;
            }
            i++;
        }
        return (n>=3)?true:false;
        
   /*     int temp = 0;
        int left = arr.length;
        for (int i=0; i<arr.length; i++){
            temp += arr[i];
            if (temp==sum) {
                left = i;
                break;
            }
        }
        int right = 0;
        temp = 0;
        for (int i=arr.length-1; i>=0; i--){
            temp += arr[i];
            if (temp==sum){
                right = i;
                break;
            }
        }
        return right>left+1;*/
    }
}
