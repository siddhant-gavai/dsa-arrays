public class SubArrays {
    public static void subArrays(int[] numbers) {
        int totalSubArray = 0;
        for (int i = 0; i < numbers.length; i++) {

            for (int j = i; j < numbers.length; j++) {

                for (int k = i; k <= j; k++) { // print karwana array ko
                    System.out.print(numbers[k] + " "); // subarray print
                }
                totalSubArray++;
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Total subarrays: " + totalSubArray);
    }

    public static void main(String[] args) {
        int[] numbers = { 2, 4, 6, 8, 10 };
        subArrays(numbers);
    }
}
