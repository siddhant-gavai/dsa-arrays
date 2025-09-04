public class PrintPairs {
    public static void printPairs(int[] numbers) {
        int totalPair = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Pairs of " + numbers[i] + " are: ");
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + numbers[i] + ", " + numbers[j] + ") ");
                totalPair++;
            }
            System.out.println(); // new line after each element's pairs

        }
        System.out.println("Total pairs: " + totalPair);
    }

    public static void main(String[] args) {
        int[] numbers = { 2, 4, 6, 8, 10 };
        printPairs(numbers);
    }
}
