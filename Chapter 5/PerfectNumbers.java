public class PerfectNumbers {
    public static boolean isPerfect(int n) {
        int sum = 1; // 1 is always a factor (for n>1)
        for (int i = 2; i <= n/2; i++) if (n % i == 0) sum += i;
        return n > 1 && sum == n;
    }
    public static void main(String[] args) {
        for (int i = 2; i <= 1000; i++) if (isPerfect(i)) System.out.println(i);
    }
}
