import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []nums = new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        Solution sol = new Solution();
        sol.rotateArray(nums,k);
        System.out.print(("["));
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]);
            if(i<nums.length-1)
                System.out.print(", ");
        }
        System.out.print("]");
    }
}
class Solution
{
    public void rotateArray(int []nums,int k)
    {
        int n = nums.length;
        k = k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
    private void reverse(int[]nums,int left,int right)
    {
        while(left<right)
        {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
