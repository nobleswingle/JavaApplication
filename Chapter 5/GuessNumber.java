import java.util.Scanner;
public class GuessNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean play = true;
        while (play) {
            int secret = (int)(Math.random()*1000) + 1;
            System.out.println("Guess a number between 1 and 1000:");
            int guess, tries = 0;
            do {
                guess = in.nextInt(); tries++;
                if (guess > secret) System.out.println("Too high. Try again.");
                else if (guess < secret) System.out.println("Too low. Try again.");
            } while (guess != secret);
            System.out.println("Congratulations. You guessed the number!");
            System.out.print("Play again? (true/false): ");
            play = in.nextBoolean();
        }
    }
}
