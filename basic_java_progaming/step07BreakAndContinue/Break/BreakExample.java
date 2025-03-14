package basic_java_progaming.step07BreakAndContinue.Break;

import java.util.Scanner;

public class BreakExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        while (true) {
            System.out.println("Enter a number (0 to quit):");
            int num = input.nextInt();

            if (num == 0) {
                System.out.println("Program is executed.");
                break;
            }
            System.out.println(counter + ". User Input: " + num);
            counter++;
        }
        input.close();
    }
}