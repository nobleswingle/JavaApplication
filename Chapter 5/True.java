int correct = 0, total = 0;
while (true) {
    // ask question, check answer
    total++;
    if (answerCorrect) correct++;
    if (total == 10) {
        double pct = correct / 10.0 * 100;
        if (pct < 75) System.out.println("Please ask your teacher for extra help.");
        else System.out.println("Congratulations, you are ready to go to the next level!");
        correct = total = 0; // reset
    }
}
