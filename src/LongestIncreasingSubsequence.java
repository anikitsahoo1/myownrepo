import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestIncreasingSubsequence {

    public static List<Integer> findLongestIncreasingSubsequence(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        int[] prev = new int[n];

        Arrays.fill(prev, -1);

        int maxLength = 1;
        int endIndex = 0;

        for (int i = 1; i < n; i++) {
            dp[i] = 1;

            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                    prev[i] = j;

                    if (dp[i] > maxLength) {
                        maxLength = dp[i];
                        endIndex = i;
                    }
                }
            }
        }

        List<Integer> lis = new ArrayList<>();
        while (endIndex != -1) {
            lis.add(nums[endIndex]);
            endIndex = prev[endIndex];
        }

        // Reverse the LIS
        List<Integer> reversedLis = new ArrayList<>();
        for (int i = lis.size() - 1; i >= 0; i--) {
            reversedLis.add(lis.get(i));
        }

        return reversedLis;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 10, 2, 1, 20, 7, 8, 25, 15 };

        List<Integer> lis = findLongestIncreasingSubsequence(nums);

        System.out.println("Longest Increasing Subsequence:");
        for (int num : lis) {
            System.out.print(num + " ");
        }
    }
}
