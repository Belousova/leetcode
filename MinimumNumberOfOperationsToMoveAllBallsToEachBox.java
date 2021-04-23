//1769. Minimum Number of Operations to Move All Balls to Each Box
class Solution {
    static public int[] minOperations(String boxes) {
        int[] answer = new int[boxes.length()];

        int cnt = 0;
        for (int i=1; i<boxes.length(); i++) {
            if (boxes.charAt(i-1)=='1') {
                cnt++;
            }
            answer[i] = cnt + answer[i-1];
        }
        cnt = 0;
        int prev = 0;
        for (int i = boxes.length()-2; i>=0; i--) {
            if (boxes.charAt(i+1)=='1') {
                cnt++;
            }
            prev = cnt + prev;
            answer[i] += prev;
        }

        return answer;
    }
}
