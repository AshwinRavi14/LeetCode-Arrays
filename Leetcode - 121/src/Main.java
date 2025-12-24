import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []prices = new int[n];
        for(int i=0;i<n;i++)
            prices[i] = sc.nextInt();
        Solution sol = new Solution();
        int result = sol.maxProfit(prices);
        System.out.print(result);
    }
}
class Solution
{
    public int maxProfit(int []prices)
    {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int price:prices)
        {
            if(price<minPrice)
                minPrice = price;
            int profit = price - minPrice;
            if(profit>maxProfit)
                maxProfit = profit;
        }
        return maxProfit;
    }
}