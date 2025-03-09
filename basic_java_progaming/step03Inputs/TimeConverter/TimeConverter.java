package basic_java_progaming.step03Inputs.TimeConverter;
import java.util.Scanner;
public class TimeConverter {
    public static void main(String[] args){
        int days;
        int hours;
        int minutes;
        int seconds;
        
        System.out.println("give your time in second");
        Scanner input=new Scanner(System.in);
        int time= input.nextInt();
        days=time/86400;
        hours=(time%86400)/3600;
        minutes=(time%3600)/60;
        seconds=time%60;
        System.out.println("time: " + time + " = " + " days: " + days + " hours: " + hours + " minutes: " + minutes + " seconds: " + seconds);
        
        input.close();

    }
    
}
