import java.util.*;

public class CCC2025J5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numRows = scan.nextInt();
        int numCols = scan.nextInt();
        int maxCost = scan.nextInt();

        int[] dp = new int[numCols];

        // Initialize first row
        for (int j = 0; j < numCols; j++) {
            int val = ((j + 1) % maxCost);
            if (val == 0) val = maxCost;
            dp[j] = val;
        }

        // Process remaining rows
        for (int i = 1; i < numRows; i++) {
            int[] newDp = new int[numCols];

            for (int j = 0; j < numCols; j++) {
                int val = ((numCols * i + j + 1) % maxCost);
                if (val == 0) val = maxCost;

                int minAbove = dp[j];
                if (j > 0) minAbove = Math.min(minAbove, dp[j - 1]);
                if (j < numCols - 1) minAbove = Math.min(minAbove, dp[j + 1]);

                newDp[j] = val + minAbove;
            }

            dp = newDp;
        }

        int ans = Integer.MAX_VALUE;
        for (int j = 0; j < numCols; j++) {
            ans = Math.min(ans, dp[j]);
        }

        System.out.println(ans);
    }
}