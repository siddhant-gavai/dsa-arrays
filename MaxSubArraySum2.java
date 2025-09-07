// in this code we will find the maximum sub array sum using prefix sum array
public class MaxSubArraySum2 {
    public static void maxSubArraySum(int[] numbers) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int[] prefix = new int[numbers.length];

        // calculate prefix array
        for (int i = 0; i < prefix.length; i++) {
            if (i == 0) {
                prefix[i] = numbers[i];
            } else {
                prefix[i] = prefix[i - 1] + numbers[i];
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                currentSum = 0;
                if (i == 0) {
                    currentSum = prefix[j];
                } else {
                    currentSum = prefix[j] - prefix[i - 1];
                }
                maxSum = Math.max(maxSum, currentSum);
            }

        }
        System.out.println("Max sum is: " + maxSum);

    }

    public static void main(String[] args) {
        int[] numbers = { 2, 4, 6, 8, 10 };
        maxSubArraySum(numbers);
    }
}
