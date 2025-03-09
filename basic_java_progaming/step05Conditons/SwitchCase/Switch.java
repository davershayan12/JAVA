package basic_java_progaming.step05Conditons.SwitchCase;
import java.util.Scanner;
public class Switch {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number between 1 to 5:");
        int number=input.nextInt();
        switch(number){
            case 1:
            System.out.println("/nThe number is 1.");
            break;
            case 2:
            System.out.println("The number is 2.");
            break;
            case 3:
            System.out.println("The number is 3.");
            break;
            case 4:
            System.out.println("The number is 4.");
            break;
            case 5:
            System.out.println("The number is 5.");
            break;
            default:
            System.out.println("The given number is out of range.");
            
        }
        input.close();
    }
    
}
