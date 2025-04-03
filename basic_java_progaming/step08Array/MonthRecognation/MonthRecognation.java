package basic_java_progaming.step08Array.MonthRecognation;
import java.util.Scanner;
public class MonthRecognation {
    public static void main(String[] args){
        String[] months={"January"," February","March","April","May","June","July","August","September","November","December"};
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of month:");
        int month=input.nextInt();
        if(month>=1 && month<=12){
            System.out.println("this month is "+months[month-1]);
        }
        else{
            System.out.println("Invalid month number. Please enter a number between 1 and 12.");
        }

    }
    
}
