// Use remainder operator: n % m == 0.
public class IsMultiple {
    public static boolean isMultiple(int m, int n) {
        return m != 0 && n % m == 0;
    }
    public static void main(String[] args) {
        System.out.println(isMultiple(3, 12)); // true
    }
}
