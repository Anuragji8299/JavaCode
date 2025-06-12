package tcsCodeVita;

import java.util.Arrays;
import java.util.Scanner;

public class Warehouse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Array of weights
        String[] weightsStr = scanner.nextLine().split(" ");
        int[] weights = Arrays.stream(weightsStr).mapToInt(Integer::parseInt).toArray();

        // Input: Maximum weight limit
        int maxLimit = Integer.parseInt(scanner.nextLine());

        // Output: Minimum number of vehicles needed
        int result = minVehiclesNeeded(weights, maxLimit);
        System.out.println(result);
    }

    public static int minVehiclesNeeded(int[] weights, int maxLimit) {
        Arrays.sort(weights); // Sort the weights in ascending order
        int vehiclesCount = 0;

        int leftPointer = 0; // Pointer for the lightest weight
        int rightPointer = weights.length - 1; // Pointer for the heaviest weight

        while (leftPointer <= rightPointer) {
            // Check if the sum of weights at the pointers is within the limit
            if (weights[leftPointer] + weights[rightPointer] <= maxLimit) {
                leftPointer++;
                rightPointer--;
            } else {
                // If the sum exceeds the limit, take only the heaviest weight
                rightPointer--;
            }

            // Increment the count of vehicles
            vehiclesCount++;
        }

        return vehiclesCount;
    }
}
