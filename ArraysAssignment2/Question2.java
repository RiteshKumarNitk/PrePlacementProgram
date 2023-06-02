// Given the integer array candyType of length n, return 
// the maximum number of different types of candies she can eat if she only eats n / 2 of them.

import java.util.HashSet;
import java.util.Set;

public class Question2 {
    public static int maxCandies(int[] candyType) {
        // Calculate the maximum number of candies Alice can eat
        int maxCandies = candyType.length / 2;

        // Create a set to store the unique types of candies
        Set<Integer> uniqueCandies = new HashSet<>();

        // Iterate over the candy types and add them to the set
        for (int candy : candyType) {
            uniqueCandies.add(candy);
        }

        // Return the minimum of unique candy types and maxCandies
        return Math.min(uniqueCandies.size(), maxCandies);
    }

    public static void main(String[] args) {
        int[] candyType = {1, 1, 2, 2, 3, 3};
        int maxTypes = maxCandies(candyType);
        System.out.println("Maximum number of different candy types Alice can eat: " + maxTypes);
    }
}
