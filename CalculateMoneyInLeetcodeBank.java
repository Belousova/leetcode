//1716. Calculate Money in Leetcode Bank
class Solution {
    public int totalMoney(int n) {
        //d - делим на 7 - получаем количество недель
        //m - остаток деления на 7
        //цикл от 1 до n
        int ans = 0;
        int d = n/7;
        int m = n%7;

        for (int i=1; i<=d; i++) {
            ans += 28+7*(i-1);
        }

        for (int i=1; i<=m; i++) {
            ans += i+d;
        }

        return ans;
    }
}