//273. Integer to English Words
class Solution {
    public String numberToWords(int num) {
        if (num==0) return "Zero";
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(0, "");
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");
        map.put(6, "Six");
        map.put(7, "Seven");
        map.put(8, "Eight");
        map.put(9, "Nine");
        map.put(10, "Ten");
        map.put(11, "Eleven");
        map.put(12, "Twelve");
        map.put(13, "Thirteen");
        map.put(14, "Fourteen");
        map.put(15, "Fifteen");
        map.put(16, "Sixteen");
        map.put(17, "Seventeen");
        map.put(18, "Eighteen");
        map.put(19, "Nineteen");
        map.put(20, "Twenty");
        map.put(30, "Thirty");
        map.put(40, "Forty");
        map.put(50, "Fifty");
        map.put(60, "Sixty");
        map.put(70, "Seventy");
        map.put(80, "Eighty");
        map.put(90, "Ninety");
        map.put(100, "Hundred");
        map.put(1000, "Thousand");
        map.put(1000000, "Million");
        map.put(1000000000, "Billion");
        
        List<Integer> arr = new ArrayList<>();
        int k = num/10;
        while (k>0) {
            arr.add(0, num%10);
            num = k;
            k = num/10;
        }
        arr.add(0,num);
        int n = arr.size();
        StringBuilder sb = new StringBuilder();
        k = n;
        int numk = k/3;
        int l = k%3;
        if (l!=0) {
            int[] nums = new int[l];
            for (int i=0; i<l; i++){
                nums[i] = arr.get(i);  
            }
            String s = belowThousand(map, nums);
            if (s.length()>0) {
                sb.append(s);
                if (numk > 0) {
                    sb.append(" ").append(map.get((int)Math.pow(1000,numk)));
                }
            }
        }
        while(numk>0) {
            numk--;
            int[] nums = new int[3];
            int j = 0;
            for (int i = l; i<l+3; i++) {
                nums[j++] = arr.get(i);
            }
            l=l+3;
            String s = belowThousand(map, nums);
            if (s.length()>0) {
                if (sb.length()>0) sb.append(" ");
                sb.append(s);
                if (numk > 0) {
                    sb.append(" ").append(map.get((int)Math.pow(1000,numk)));
                }
            }
            
        }
        return sb.toString().trim();
    }
    private String belowThousand(Map<Integer, String> map, int[] num){
        StringBuilder sb = new StringBuilder();
        int d1 = 0;
        if (num.length==3) {
            if (num[0]>0){
                sb.append(map.get(num[0])).append(" ").append("Hundred");
            }
            d1 = 1;
        }
        if (num.length>=2){
            if (num[d1]>1){
                if (sb.length()>1) sb.append(" ");
                sb.append(map.get(num[d1]*10)).append(" ").append(map.get(num[d1+1]));
            } else {
                int l = num[d1]*10 + num[d1+1];
                if (sb.length()>1) sb.append(" ");
                sb.append(map.get(l));
            }
        }
        if (num.length==1){
            sb.append(map.get(num[0]));
        }
        return sb.toString().trim();
    }
}
