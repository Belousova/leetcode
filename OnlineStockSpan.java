//901. Online Stock Span
/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
class StockSpanner {
    
    Stack<int[]> st;
    int index;
    
    public StockSpanner() {
        st = new Stack<>();    
        index = 0;
    }
    
    public int next(int price) {
        
        int ans = 1;
        while (!st.isEmpty() && st.peek()[1] <= price) {
            st.pop();
        }
        
        if (!st.isEmpty()) {   
            ans =  index - st.peek()[0];
        } else {
            ans = index + 1;
        }
        st.push(new int[]{index, price});
        index++;
        return ans;
        
    }
}

