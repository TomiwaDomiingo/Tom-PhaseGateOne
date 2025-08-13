import java.util.Scanner;

public class Task5{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sumEvenNumbers = 0;

        for (int index = 0; index < 10; index++) {
            System.out.print("Enter score " + (index + 1) + ": ");
            int score = input.nextInt();  
            if (score % 1 == 0) { 
                sumEvenNumbers += score;
            }
        }

        System.out.println("Sum of even numbers: " + sumEvenNumbers);
        input.close();
    }
}