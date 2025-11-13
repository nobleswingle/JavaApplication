public class DisplayDigits {
    public static int intQuotient(int a, int b) { return a / b; }
    public static int intRemainder(int a, int b) { return a % b; }
    public static void displayDigits(int n) {
        String s = Integer.toString(n);
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
            if (i < s.length()-1) System.out.print("  ");
        }
        System.out.println();
    }
    public static void main(String[] args) { displayDigits(4562); }
}
