package Greedy;

import java.util.Arrays;

public class CandyRating {

    public int candy(int[] ratings) {
        int n = ratings.length;
        int totalCandies = 0;
        int[] candies = new int[n];
        Arrays.fill(candies, 1); // Step 1: Give 1 candy to each child

        // Step 2: Left to right pass
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        // Step 3: Right to left pass
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1] && candies[i] <= candies[i + 1]) {
                candies[i] = candies[i + 1] + 1;
            }
        }

        // Step 4: Sum all candies
        for (int candy : candies) {
            totalCandies += candy;
        }

        return totalCandies;
    }

    // Main method to test the candy function
    public static void main(String[] args) {
        CandyRating sol = new CandyRating();

        int[] ratings1 = {1, 0, 2};
        int[] ratings2 = {1, 2, 2};
        int[] ratings3 = {1, 3, 4, 5, 2};

        System.out.println("Total candies (ratings1): " + sol.candy(ratings1)); // Output: 5
        System.out.println("Total candies (ratings2): " + sol.candy(ratings2)); // Output: 4
        System.out.println("Total candies (ratings3): " + sol.candy(ratings3)); // Output: 11
    }
}
