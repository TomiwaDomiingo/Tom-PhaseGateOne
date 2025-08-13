import java.util.Scanner;

public class SumAndAverageScores{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;

        for (int index = 0; index < 10; index++) {
            System.out.print("Enter score " + (index + 1) + ": ");
            int score = input.nextInt();
            sum += score;
        }

        double average = sum / 10;
        System.out.println("Sum of scores: " + sum);
        System.out.println("Average of scores: " + average);
        input.close();
    }
}