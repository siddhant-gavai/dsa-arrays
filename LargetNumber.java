
public class LargetNumber {
    public static int findLargest(int[] numbers) {
        int largest = Integer.MIN_VALUE; // -Infinity
        int smallest = Integer.MAX_VALUE; // +Infinity
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("The smallest number is: " + smallest);
        return largest;

    }

    public static void main(String[] args) {
        int[] numbers = { 3, 5, 7, 2, 8, 20, 56, 44, 4, 3 };
        int largest = findLargest(numbers);
        System.out.println("The largest number is: " + largest);
    }
}
