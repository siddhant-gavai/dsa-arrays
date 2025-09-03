import java.util.*;

public class array1 {
    public static void main(String[] args) {

        int[] numbers = { 10, 20, 30, 40, 50 };
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Input Output
        int[] marks = new int[100];
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your physics marks");
        marks[0] = sc.nextInt(); // physics
        System.out.println("enter your chemistry marks");
        marks[1] = sc.nextInt(); // chemistry
        System.out.println("enter your maths marks");
        marks[2] = sc.nextInt(); // maths
        System.out.println("enter your english marks");
        marks[3] = sc.nextInt(); // english
        System.out.println("enter your biology marks");
        marks[4] = sc.nextInt(); // biology

        System.out.println("phy" + " " + marks[0]);
        System.out.println("chem" + " " + marks[1]);
        System.out.println("math" + " " + marks[2]);
        System.out.println("eng" + " " + marks[3]);
        System.out.println("bio" + " " + marks[4]);

        int percentage = (marks[0] + marks[1] + marks[2] + marks[3] + marks[4]) / 5;
    }
}