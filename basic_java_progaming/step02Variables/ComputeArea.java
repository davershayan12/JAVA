package basic_java_progaming.step02Variables;

public class ComputeArea {
    public static void main(String[] args){
        // Declaring variables
        double area;
        double radius;

        // Assign radius a value
        radius = 10;
        area = radius * radius * 3.142;

        // Printing the results
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
    }
}