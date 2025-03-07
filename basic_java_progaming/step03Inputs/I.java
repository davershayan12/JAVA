package basic_java_progaming.step03Inputs;
import java.util.Scanner;

public class I {
    public static void main(String[] args){
        System.out.print("Enter a double value: ");
        Scanner input = new Scanner(System.in);
        double d = input.nextDouble();
        System.out.println("You entered: " + d);
        input.close();
    }
}