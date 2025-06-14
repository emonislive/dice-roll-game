import java.util.Random;
import java.util.Scanner;
public class DiceRoll {
    public void diceVisualization(int diceVal) {
        String dice1 = """
                 ---------
                |         |
                |    0    |
                |         |
                 ---------
                """;
        String dice2 = """
                 ---------
                | 0       |
                |         |
                |       0 |
                 ---------
                """;
        String dice3 = """
                 ---------
                | 0       |
                |    0    |
                |       0 |
                 ---------
                """;
        String dice4 = """
                 ---------
                | 0     0 |
                |         |
                | 0     0 |
                 ---------
                """;
        String dice5 = """
                 ---------
                | 0     0 |
                |    0    |
                | 0     0 |
                 ---------
                """;
        String dice6 = """
                 ---------
                | 0     0 |
                | 0     0 |
                | 0     0 |
                 ---------
                """;
        switch (diceVal) {
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
        }
    }

    public static void main(String[] args) {
        int totalDice;
        int randomDice;
        int totalScore = 0;

        DiceRoll access = new DiceRoll();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        System.out.print("Enter the amount of Dice you want to roll: ");
        totalDice = scanner.nextInt(); // TODO: ADD NON INTEGER USER-INPUT EXCEPTION


        for (int i = 0; i < totalDice; i++) {
            randomDice = random.nextInt(1,7);
            System.out.println("Your No. " + (i + 1) + " Dice : " + randomDice);
            access.diceVisualization(randomDice);
            totalScore += randomDice;
        }
        System.out.println("Final Score: " + totalScore);
    }
}
