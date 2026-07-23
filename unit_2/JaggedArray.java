public class JaggedArray {
    public static void main(String[] args) {
        // Step 1: Declare a 2D array with 3 rows (column sizes undefined)
        int[][] jaggedArr = new int[3][];

        // Step 2: Dynamically allocate different sizes to each row
        jaggedArr[0] = new int[2]; // Row 0 has 2 columns
        jaggedArr[1] = new int[4]; // Row 1 has 4 columns
        jaggedArr[2] = new int[1]; // Row 2 has 1 column

        // Literal initialization of a jagged array
        int[][] directJagged = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };
        
        System.out.println(directJagged[1][1]);
    }
}
