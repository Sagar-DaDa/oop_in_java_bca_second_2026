public class RectangularArray {
    public static void main(String[] args) {
        int[][] rectangularArr = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // Accessing an element: array[rowIndex][columnIndex]
        int value = rectangularArr[1][2]; // Row 1, Column 2 -> Returns 6
        
        System.out.println(value);
    }
}