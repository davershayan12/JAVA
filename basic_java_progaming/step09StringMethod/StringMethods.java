package basic_java_progaming.step09StringMethod;
/*String methods use for obtaining string length, for
accessing characters in the string, for concatenating strings, for
converting a string to upper or lowercases, and for trimming a
string.Strings are objects in Java. */

public class StringMethods {
    public static void main(String[] args){
        String message="   Hello world   ";
        
        System.out.println("length:" + message.length());//Return the numbers of characters in string including spaces.
        
        System.out.println("lowercase: " + message.toLowerCase());//Return charaters in lower case.
        
        System.out.println("Uppercase: " + message.toUpperCase());//Return charaters in upper case.
        
        System.out.println("charAt: " + message.charAt(10));//Returns the character at the specified index from this string.

        String anotherMassege= message.concat(" to everyone.");
        System.out.println("concat: " + anotherMassege);//Returns a new string that concatenates this string with string inside paranthsis.
        
        System.out.println("trim: " + message.trim());//Returns a new string with whitespace characters trimmed on both sides.

        
        /*The methods in can only be invoked from a specific string instance.For this reason, these methods are called instance methods.
         * A non-instance method is called a static method.A static method can be invoked without using an object.All the methods defined in the Math class are static methods. They are not tied to a specific object instance.
        */
        //example:
        int num=3;
        System.out.println(Math.pow(num,4));

            }
}
