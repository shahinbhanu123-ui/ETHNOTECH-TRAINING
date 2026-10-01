public class ColumnSum {

    public static void main(String[] args) {

        int[][] nums = {
            {1, 2, 3},
            {4, 5, 6}
        };

        for (int j = 0; j < nums[0].length; j++) {

            int sum = 0;

            for (int i = 0; i < nums.length; i++) {
                sum = sum + nums[i][j];
            }

            System.out.println("Column " + (j + 1) + " Sum = " + sum);
        }
    }
}