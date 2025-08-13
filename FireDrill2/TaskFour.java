import java.util.Scanner;

public class SumEvenIndexes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sumEvenIndexes = 0;
        int index = 0;

        while (index < 10) {
            System.out.print("Enter score " + (index + 1) + ": ");
            int score = input.nextInt();
            if (index % 2 == 0) { 
                sumEvenIndexes += score;
            }
            index++;
        }

        System.out.println("Sum of scores at even indexes: " + sumEvenIndexes);
        input.close();
    }
}