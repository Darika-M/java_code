class SwapRows {
    public static void main(String[] args) {

        int[][] a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rows = a.length;
        int cols = a[0].length;

      
        for (int j = 0; j < cols; j++) {
            int temp = a[0][j];
            a[0][j] = a[rows - 1][j];
            a[rows - 1][j] = temp;
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
