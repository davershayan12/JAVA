package basic_java_progaming.step05Conditons.TwoWay_if_Statement;

import java.util.Scanner;

public class CircleArea {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter radius value: ");
        int radiusOfCircle = input.nextInt();
        //Two-Way if Statement
        if (radiusOfCircle > 0) {
            double areaOfCircle = 2 * 3.142 * (double) radiusOfCircle;
            System.out.println("Area Of Circle is: " + areaOfCircle);
        } else {
            System.out.println("Radius must be a positive value.");
        }
        input.close();
    }
    
}
