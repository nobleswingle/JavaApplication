public class RoundMethods {
    public static double Integer(double x) {
        return Math.floor(x + 0.5);
    }
    public static double roundToTenths(double x) {
        return Math.floor(x * 10 + 0.5) / 10.0;
    }
    public static double roundToHundredths(double x) {
        return Math.floor(x * 100 + 0.5) / 100.0;
    }
    public static double roundToThousandths(double x) {
        return Math.floor(x * 1000 + 0.5) / 1000.0;
    }
    public static void main(String[] args) {
        double[] values = {3.14159, 2.71828, -1.2345};
        for (double v : values) {
            System.out.printf("Original: %.5f Integer: %.0f Tenths: %.3f Hundredths: %.4f Thousandths: %.5f%n",
                v, roundToInteger(v), roundToTenths(v), roundToHundredths(v), roundToThousandths(v));
        }
    }
}
