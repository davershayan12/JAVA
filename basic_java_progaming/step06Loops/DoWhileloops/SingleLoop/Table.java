package basic_java_progaming.step06Loops.DoWhileloops.SingleLoop;

import java.util.Scanner;

public class Table {
    public static void main(String[] var0) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a table number:");
        int number = input.nextInt();
        System.out.println("\n");
        input.close();
        int i=1;
        do{
            System.out.println(number + "x" +i + "=" + number * i);
        }while(i<=10);   
        
     }
}
