public class SubArrays {
    public static void subArrays(int[] numbers) {
        int totalSubArray = 0;

        // initialize max and min
        int maxSum = Integer.MIN_VALUE; // sabse chhoti value se start
        int minSum = Integer.MAX_VALUE; // sabse badi value se start

        for (int i = 0; i < numbers.length; i++) {

            for (int j = i; j < numbers.length; j++) {
                int currSum = 0; // current subarray ka sum

                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + " "); // subarray print
                    currSum += numbers[k]; // sum nikalna
                }

                // check for maximum sum
                if (currSum > maxSum) {
                    maxSum = currSum;
                }

                // check for minimum sum
                if (currSum < minSum) {
                    minSum = currSum;
                }

                totalSubArray++;
                System.out.println(" -> Sum = " + currSum); // har subarray ka sum
            }
            System.out.println();
        }

        System.out.println("Total subarrays: " + totalSubArray);
        System.out.println("Maximum Subarray Sum: " + maxSum); // max sum
        System.out.println("Minimum Subarray Sum: " + minSum); // min sum
    }

    public static void main(String[] args) {
        int[] numbers = { 2, 4, 6, 8, 10 };
        subArrays(numbers);
    }
}
