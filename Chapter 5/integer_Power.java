//Use formula c = sqrt(a^2 + b^2).
public class integer_Power {
    public static long integerPower(int base, int exponent) {
        long result = 1;
        for (int i = 0; i < exponent; i++) result *= base;
        return result;
    }
    public static void main(String[] args) {
        System.out.println(integerPower(3,4)); // 81
    }
}
