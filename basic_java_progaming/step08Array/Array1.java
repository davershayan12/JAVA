/*In Java, an array is a data structure that allows you to store multiple values of the same type in a single variable. Arrays are fixed in size, meaning their length cannot be changed after they are created. Array indices start at 0. The first element is accessed with index 0, the second with index 1, and so on. */
package basic_java_progaming.step08Array;

public class Array1 { 
    public static void main(String[] args){
        int[] numbers=new int[10];// Declares an array of integers
        for(int i=0;i<=10;i++){
            numbers[i]=i;
        }
    }
    
}
