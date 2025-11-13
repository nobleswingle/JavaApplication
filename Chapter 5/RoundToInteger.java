import java.util.Scanner;
public class RoundToInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers (type 'q' to quit):");
        while (input.hasNextDouble()) {
            double x = input.nextDouble();
            double y = Math.floor(x + 0.5);
            System.out.printf("Original: %.4f  Rounded: %.0f%n", x, y);
        }
    }
}
