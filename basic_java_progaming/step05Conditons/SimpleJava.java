package basic_java_progaming.step05Conditons;
import java.util.Scanner;
public class SimpleJava {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        //One-Way if Statement
        if(number==5){
            System.out.println("highfive");

        }
        if(number==4){
            System.out.println("Te number is 4");
        }
        input.close();

    }
    
}
