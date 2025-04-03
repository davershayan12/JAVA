package basic_java_progaming.step03Inputs.Inputs;
import java.util.Scanner; 

public class Inputs { 
    public static void main(String[] args) { 

        //Prompt the user to enter a double value
        System.out.print("Enter a double value: ");
        Scanner input = new Scanner(System.in);//Create a Scanner object to read input
        double number = input.nextDouble();//Read a double value from the user
        System.out.println("You entered: " + number); 

        //Prompt the user to enter a single word
        System.out.print("Enter a word: ");
        String word = input.next(); //Read a single word from the user
        System.out.println("You entered: " + word); 

        //Prompt the user to enter a line
        System.out.print("Enter a line: ");
        String line = input.nextLine(); //Read a full line from the user
        System.out.println("You entered: " + line); 

        //Prompt the user to enter an integer
        System.out.print("Enter a number: ");
        int number1 = input.nextInt(); //Read an integer value from the user
        System.out.println("You entered: " + number1); 

        //Prompt the user to enter a floating-point number
        System.out.print("Enter a float value: ");
        float number2 = input.nextFloat(); //Read a float value from the user
        System.out.println("You entered: " + number2); 

        input.close(); //Close the Scanner object to release resources
    }
}