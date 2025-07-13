public class DirectionFinder {
    public static void main(String[] args) {
        int[][] data = {{1,2,3}, {4,5,6}, {7,8,9}};
        char[] direction = {'D', 'R', 'R', 'U', 'L', 'L', 'D', 'D'};
        int num = magicNumberFinder(data, direction);
        System.out.println("Magic number is: " + num);
    }

    static int magicNumberFinder(int[][] arr, char[] direction) {
        int i=0, j=0;
        for (char ch : direction) {
            switch (ch) {
                case 'R': j++; break;
                case 'L': j--; break;
                case 'U': i--; break;
                case 'D': i++; break;
            }
        }
        return arr[i][j];
    }
}
