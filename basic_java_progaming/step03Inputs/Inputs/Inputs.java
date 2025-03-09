package basic_java_progaming.step03Inputs.Inputs;
import java.util.Scanner;

public class Inputs {
    public static void main(String[] args){
        System.out.print("Enter a double value: ");
        Scanner input = new Scanner(System.in);
        double d = input.nextDouble();
        System.out.println("You entered: " + d);
        input.close();
    }
}