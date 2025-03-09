package basic_java_progaming.step05Conditons;
import java.util.Scanner;
public class IncomeTax {
    public static void main (String[] args){
        Scanner input =new Scanner(System.in);
        double income=input.nextDouble();
        if (income <=1000000  && income>=104001 ){
            double incometax=income*0.3;
            System.out.println("Income Tax:" + incometax);

        }
        
        else if (income <=104000  && income>=79001 ){
            double incometax=income*0.2;
            System.out.println("Income Tax:" + incometax);

        }
        else if (income <=79000  && income>=62001 ){
            double incometax=income*0.1;
            System.out.println("Income Tax:" + incometax);

        }
        else if (income <=62000  && income>=50000 ){
            double incometax=income*0.05;
            System.out.println("Income Tax:" + incometax);

        }
        input.close();
    }
    
}
