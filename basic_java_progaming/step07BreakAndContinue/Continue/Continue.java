package basic_java_progaming.step07BreakAndContinue.Continue;
import java.util.Scanner;
public class Continue {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int counter=1;
        while(counter!=0){
            System.out.println("Guess a number(0 for quit): ");
            int num=input.nextInt();
            
            if (num==5){
                System.out.println("Correct guess!");
                continue;
            }
            System.out.println("Incorect! ");
            
            counter=num;
        }
        input.close();
    }
    
}
