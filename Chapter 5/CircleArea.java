import java.util.Scanner;
public class CircleArea {
    public static double circleArea(double r) { return Math.PI * r * r; }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Radius: "); double r = in.nextDouble();
        System.out.printf("Area: %.4f%n", circleArea(r));
    }
}
