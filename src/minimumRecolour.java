//2379. Minimum Recolors to Get K Consecutive Black Blocks
//Solved
//        Easy
//Topics
//        Companies
//Hint
//
//You are given a 0-indexed string blocks of length n, where blocks[i] is either 'W' or 'B', representing the color of the ith block. The characters 'W' and 'B' denote the colors white and black, respectively.
//
//You are also given an integer k, which is the desired number of consecutive black blocks.
//
//In one operation, you can recolor a white block such that it becomes a black block.
//
//Return the minimum number of operations needed such that there is at least one occurrence of k consecutive black blocks.
//
//
//
//Example 1:
//
//Input: blocks = "WBBWWBBWBW", k = 7
//Output: 3
//Explanation:
//One way to achieve 7 consecutive black blocks is to recolor the 0th, 3rd, and 4th blocks
//so that blocks = "BBBBBBBWBW".
//It can be shown that there is no way to achieve 7 consecutive black blocks in less than 3 operations.
//        Therefore, we return 3.
//
//Example 2:
//
//Input: blocks = "WBWBBBW", k = 2
//Output: 0
//Explanation:
//No changes need to be made, since 2 consecutive black blocks already exist.
//        Therefore, we return 0.
//
//
//
//Constraints:
//
//n == blocks.length
//    1 <= n <= 100
//blocks[i] is either 'W' or 'B'.
//        1 <= k <= n
//

import java.util.*;

public class minimumRecolour {
    public int minimumRecolour(String blocks, int k) {
        int count = 0;
        int a = 0;
        int min = Integer.MAX_VALUE;
        String str = "";

        for (int j = k; j <= blocks.length(); j++) {
            count = 0;
            str = blocks.substring(a, j);

            for (int i = 0; i < str.length(); i++) {
                if (Character.toString(str.charAt(i)).equals("W")) {
                    count++;
                }
            }
            a++;
            int b = count;
            if (b < min) {
                min = b;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the blocks string:");
        String blocks = sc.nextLine();

        System.out.println("Enter the value of k:");
        int k = sc.nextInt();

        minimumRecolour solution = new minimumRecolour();
        int result = solution.minimumRecolour(blocks, k);

        System.out.println("Minimum recolors required: " + result);

        sc.close();
    }
}
