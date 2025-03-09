package basic_java_progaming.step06Loops.Forloops;
import java.util.Scanner;
public class Table {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a table number:");
        int number=input.nextInt();
        System.out.println("\n");
        input.close();
        for(int i=1;i<=10;i++){
            System.out.println(number + "x" +i + "=" + number * i);
        }

    }
    
}
