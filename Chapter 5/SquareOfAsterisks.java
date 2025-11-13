public class SquareOfAsterisks {
    public static void squareOfAsterisks(int side) {
        for (int r = 0; r < side; r++) {
            for (int c = 0; c < side; c++) System.out.print('*');
            System.out.println();
        }
    }
    public static void main(String[] args) { squareOfAsterisks(4); }
}
