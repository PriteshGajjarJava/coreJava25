import java.util.Arrays;
public class MatrixAddition {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 4}, {5, 7}};
        int[][] arr2 = {{5, 8}, {1, 6}};
        // [1 4] + [5 8]
        // [5 7].  [1 6]
        int[][] res = matrixAdd(arr1, arr2);
        for (int i=0; i < res.length; i++) {
            System.out.println(Arrays.toString(res[i]));
        }
        // {{6, 12} {6, 13}}
    }
    static int[][] matrixAdd(int[][] a, int[][] b) {
        int[][] c = new int[a.length][a[0].length];

        for (int i=0; i < a.length; i++) {
            c[i] = new int[a[i].length];
            for(int j=0; j<a[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }
}
