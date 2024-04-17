import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        // Base case: if numRows is 0, return an empty triangle
        if (numRows == 0) {
            return triangle;
        }

        // Create the first row with a single element 1
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        // Generate the remaining rows
        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = triangle.get(i - 1);
            List<Integer> currRow = new ArrayList<>();

            // The first element is always 1
            currRow.add(1);

            // Calculate the middle elements by adding the two numbers above
            for (int j = 1; j < i; j++) {
                int left = prevRow.get(j - 1);
                int right = prevRow.get(j);
                currRow.add(left + right);
            }

            // The last element is always 1
            currRow.add(1);
            triangle.add(currRow);
        }
        return triangle;
    }

    public static void main(String[] args) {
        int rows =5 ;
        System.out.println(generate(rows));
    }
}
