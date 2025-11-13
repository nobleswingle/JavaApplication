import java.util.Scanner;
public class TempConv {
    public static double celsius(double f) { return 5.0/9.0*(f - 32); }
    public static double fahrenheit(double c) { return 9.0/5.0*c + 32; }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1 to convert F->C or 2 for C->F: ");
        int choice = in.nextInt();
        if (choice == 1) { System.out.print("F: "); double f = in.nextDouble(); System.out.printf("C: %.2f%n", celsius(f)); }
        else { System.out.print("C: "); double c = in.nextDouble(); System.out.printf("F: %.2f%n", fahrenheit(c)); }
    }
}
