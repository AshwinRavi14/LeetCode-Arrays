import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i] = sc.nextInt();
        }
        Solution sol = new Solution();
        int k = sol.removeDuplicates(nums);
        System.out.print("[");
        for(int i=0;i<k;i++)
        {
            System.out.print(nums[i]);
            if(i<k-1) System.out.print(", ");
        }
        System.out.print("]");
    }
}

class Solution
{
    public int removeDuplicates(int []nums)
    {
        if(nums.length <= 2)
            return nums.length;
        int k=2;
        for(int i=2;i< nums.length;i++)
        {
            if(nums[i] != nums[k-2])
            {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}