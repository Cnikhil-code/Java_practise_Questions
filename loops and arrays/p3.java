public class p3 {
    public static void main(String[] args) {
        int[][] A = {
                { 1, 2, 3, 4 }, { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }, { 13, 14, 15, 16 }
        };
        int[][] B = {
                { 1, 0, 0, 0 }, { 0, 1, 0, 0 },
                { 0, 0, 1, 0 }, { 0, 0, 0, 1 }
        };
        int[][] sum = new int[4][4];
        int[][] product = new int[4][4];

        // Addition
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                sum[i][j] = A[i][j] + B[i][j];

        // Multiplication
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                for (int k = 0; k < 4; k++)
                    product[i][j] += A[i][k] * B[k][j];

        System.out.println("Addition Result:");
        for (int[] row : sum) {
            for (int val : row)
                System.out.print(val + "\t");
            System.out.println();
        }

        System.out.println();

        System.out.println("Multiplication Result:");
        for (int[] row : product) {
            for (int val : row)
                System.out.print(val + "\t");
            System.out.println();
        }
    }
}