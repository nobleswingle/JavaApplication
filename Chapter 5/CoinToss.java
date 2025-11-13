import java.util.Random;
public class CoinToss {
    enum Coin { HEADS, TAILS }
    public static Coin flip() { return Math.random() < 0.5 ? Coin.HEADS : Coin.TAILS; }
    public static void main(String[] args) {
        int heads = 0, tails = 0;
        for (int i = 0; i < 100; i++) {
            if (flip() == Coin.HEADS) heads++; else tails++;
        }
        System.out.println("Heads: " + heads + " Tails: " + tails);
    }
}
