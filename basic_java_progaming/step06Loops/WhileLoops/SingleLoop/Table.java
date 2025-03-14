package basic_java_progaming.step06Loops.WhileLoops.SingleLoop;
import java.util.Scanner;
public class Table {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a table number: ");
        int number=input.nextInt();
        int i=1;
        while(i<=10){
            System.out.println(number + " x " + i + " = " + number*i);
            i++;
        }
        input.close();
    }
    
}
