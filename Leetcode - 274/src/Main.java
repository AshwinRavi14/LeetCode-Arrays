import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int citations[] = new int[n];
        for(int i=0;i<n;i++)
        {
            citations[i] = sc.nextInt();
        }
        Solution sol = new Solution();
        int result =  sol.hIndex(citations);
        System.out.print(result);
    }
}

class Solution
{
    public int hIndex(int []citations)
    {
        Arrays.sort(citations);
        //System.out.println(Arrays.toString(citations));  // PRINT ARRAY CONTENT

        for(int i=0;i<citations.length;i++)
        {
            int h = citations.length - i;
            if(citations[i] >= h)
            {
                return h;
            }
        }
        return 0;
    }
}