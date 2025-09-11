public class largest2d {

    public static int largest(int[][] matrix) {

        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int curr = matrix[i][j];
                if (curr > largest) {
                    largest = curr;
                }

            }

        }
        System.out.println("the largest element is " + largest);
        return largest;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        largest(matrix);
    }

}
