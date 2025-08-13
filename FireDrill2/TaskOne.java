import java.util.Scanner;

public class SumScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;

        for (int index = 0; index < 10; index++) {
            System.out.print("Enter score " + (index + 1) + ": ");
            int score = input.nextInt();
            sum += score;
        }

        System.out.println("Sum of scores: " + sum);
        input.close();
    }
}