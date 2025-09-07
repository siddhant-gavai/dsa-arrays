// Find the maximum sum of a contiguous subarray using Kadane's Algorithm
// public class MaxSubArraySum3 {

//     public static void kadaness(int[] numbers) {
//         int maxSum = Integer.MIN_VALUE;
//         int currentSum = 0;
//         for (int i = 0; i < numbers.length; i++) {
//             currentSum = currentSum + numbers[i];
//             if (currentSum < 0) {
//                 currentSum = 0;
//             }
//             maxSum = Math.max(maxSum, currentSum);
//         }
//         System.out.println("Max sum is: " + maxSum);
//     }

//     public static void main(String[] args) {
//         int[] numbers = { -2, -3, 4, -1, -2, 1, 5, -3 };
//         kadaness(numbers);
//     }
// }

// Handling the case when all numbers are negative
public class MaxSubArraySum3 {

    public static void kadaness(int[] numbers) {
        int maxSum = numbers[0]; // Start from first element
        int currentSum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            currentSum = Math.max(numbers[i], currentSum + numbers[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println("Max sum is: " + maxSum);
    }

    public static void main(String[] args) {
        int[] numbers = { -2, -3, -1, -4 }; // Example: all numbers are negative
        kadaness(numbers);
    }
}
