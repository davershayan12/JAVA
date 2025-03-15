package basic_java_progaming.step08Array.Examples;
import java.util.Scanner;

public class ArrayInputs {
    public static void main(String[] args) {
        
        int[] numbers = new int[10];
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) { 
            numbers[i] = input.nextInt();
        }
        input.close();

        System.out.println("You entered:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}