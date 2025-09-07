// Brute Force Approach
public class MaxSubArraySum {

    public static void maxSubArraySum(int[] numbers) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < numbers.length; i++) {

            for (int j = i; j < numbers.length; j++) {
                currentSum = 0;

                for (int k = i; k <= j; k++) { // print karwana array ko
                    // SubArray Sum
                    currentSum = currentSum + numbers[k];

                }
                System.out.println(currentSum);
                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }

            }

        }
        System.out.println("Max SubArray Sum is: " + maxSum);
    }

    public static void main(String[] args) {
        int[] numbers = { 2, 4, 6, 8, 10 };
        maxSubArraySum(numbers);
    }
}