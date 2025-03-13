package basic_java_progaming.step07BreakAndContinue.Continue;
import java.util.Scanner;
public class Continue {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int counter=1;
        while(counter!=0){
            int num=input.nextInt();
            System.out.println("The user number: " + num);
            counter=num;
        }
        input.close();
    }
    
}
