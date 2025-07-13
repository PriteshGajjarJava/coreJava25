public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr = {{1,2}, {3,4}, {5,6}, {7,8}}; //2-D array of size 4 * 2 (4 columns, 2 rows)

        for (int i=0; i < arr.length; i++) {
            for (int j=0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
