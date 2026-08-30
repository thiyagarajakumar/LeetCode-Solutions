class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0], max=0;
        for(int p:prices)
        {
        if(min>p)
        {
            min=p;
        }
        int price=p-min;
        if(price>max)
        {
            max=price;
        }
        
            
        }
        return max;
    }
}