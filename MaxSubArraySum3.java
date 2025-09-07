// Find the maximum sum of a contiguous subarray using Kadane's Algorithm
public class MaxSubArraySum3 {

    public static void kadaness(int[] numbers) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            currentSum = currentSum + numbers[i];
            if (currentSum < 0) {
                currentSum = 0;
            }
            maxSum = Math.max(maxSum, currentSum);
        }
        System.out.println("Max sum is: " + maxSum);
    }

    public static void main(String[] args) {
        int[] numbers = { -2, -3, 4, -1, -2, 1, 5, -3 };
        kadaness(numbers);
    }
}
