import java.security.SecureRandom;
import java.util.Scanner;
public class CAIMultiply {
    public static void main(String[] args) {
        SecureRandom rand = new SecureRandom();
        Scanner in = new Scanner(System.in);
        while (true) {
            int a = rand.nextInt(10);
            int b = rand.nextInt(10);
            int answer;
            do {
                System.out.printf("How much is %d times %d? ", a, b);
                answer = in.nextInt();
                if (answer == a*b) System.out.println("Very good!");
                else System.out.println("No. Please try again.");
            } while (answer != a*b);
        }
    }
}
