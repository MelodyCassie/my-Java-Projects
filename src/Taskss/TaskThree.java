package Taskss;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int index = 1;
            int sum = 0;
            while (index <= 10) {
                System.out.print("ENTER YOUR SCORE: ");
                int score = scanner.nextInt();

                sum += index + score;
                index++;

                System.out.print(sum);

                double average = sum / 10.0;




                System.out.print(average);

            }
    }
}
