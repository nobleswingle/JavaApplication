public class Minimum3 {
    public static double minimum3(double a, double b, double c) {
        return Math.min(a, Math.min(b, c));
    }
    public static void main(String[] args) {
        System.out.println(minimum3(3.5, 2.2, 5.1)); // 2.2
    }
}
