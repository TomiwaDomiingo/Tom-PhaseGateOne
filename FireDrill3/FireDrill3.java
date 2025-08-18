import java.util.Scanner;

public class FIreDrill3 {
    public int[] TaskOne() {
        Scanner input = new Scanner(System.in);
        int[] scores = new int[10];
        System.out.println("Enter 10 scores:");
        for (int indexx = 0; indexx < 10; indexx++) {
            System.out.print("Score " + (indexx + 1) + ": ");
            scores[indexx] = input.nextInt();
        }
        return scores;
    }


    public void TaskTwo(int[] scores) {
        System.out.println("Scores (Vertical):");
        for (int score : scores) {
            System.out.println(score);
        }
    }


    public void TaskThree(int[] scores) {
        System.out.println("Scores (Horizontal):");
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();
    }


    public int[] TaskFour(int[] scores) {
        int[] evenIndexScores = new int[(scores.length + 1) / 2];
        for (int index = 0, indexx = 0; index < scores.length; index += 2, indexx++) {
            evenIndexScores[indexx] = scores[index];
        }
        return evenIndexScores;
    }

    public int[] TaskFive(int[] scores) {
        int newSize = scores.length / 2;
        int[] oddIndexScores = new int[newSize];
        int outputIndex = 0;
        for (int inputIndex = 1; inputIndex < scores.length; inputIndex += 2) {
            oddIndexScores[outputIndex] = scores[inputIndex];
            outputIndex++;
        }
        return oddIndexScores;
    }



    public static void main(String[] args) {
        FIreDrill3 drill = new FIreDrill3();
        int[] scores = drill.TaskOne();
        drill.TaskTwo(scores);
        drill.TaskThree(scores);
        int[] evenIndexScores = drill.TaskFour(scores);
        System.out.println("Scores at even indexes:");
        for (int score : evenIndexScores) {
            System.out.print(score + " ");
        }
        System.out.println();
        int[] oddIndexScores = drill.TaskFive(scores);
        System.out.println("Scores at odd indexes:");
        for (int score : oddIndexScores) {
            System.out.print(score + " ");
        }
        System.out.println();
    }
}