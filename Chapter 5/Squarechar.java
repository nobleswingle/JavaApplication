import java.util.Scanner;
public class SquareChar {
    public static void squareOfChar(int side, char fill) {
        for (int r = 0; r < side; r++) {
            for (int c = 0; c < side; c++) System.out.print(fill);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Side: "); int s = input.nextInt();
        System.out.print("Fill char: "); char f = input.next().charAt(0);
        squareOfChar(s, f);
    }
}
