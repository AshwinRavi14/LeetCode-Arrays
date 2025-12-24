import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int nums1[] = new int[m];
        for(int i=0;i<m;i++)
        {
            nums1[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        int nums2[] = new int[n];
        for(int i=0;i<n;i++)
        {
            nums2[i] = sc.nextInt();
        }
        nums1 = Arrays.copyOf(nums1,m+n);

        Solution sol = new Solution();
        sol.mergesort(nums1,m,nums2,n);
        System.out.print(Arrays.toString(nums1));
    }
}

class Solution
{
    public void mergesort(int []nums1, int m ,int [] nums2,int n)
    {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        while(i>=0 && j>=0)
        {
            if(nums1[i] > nums2[j])
            {
                nums1[k] = nums1[i];
                i--;
            }
            else
            {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        while(j>=0)
        {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}