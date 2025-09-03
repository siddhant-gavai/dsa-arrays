public class array1 {
    public static void main(String[] args) {
        int[] marks = new int[5];
        marks[0] = 85;
        marks[1] = 90;
        marks[2] = 78;
        marks[3] = 88;
        marks[4] = 92;

        System.out.println("Array elements:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        int[] numbers = { 10, 20, 30, 40, 50 };
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}