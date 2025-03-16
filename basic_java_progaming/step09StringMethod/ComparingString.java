package basic_java_progaming.step09StringMethod;

public class ComparingString {
    public static void main(String[] args){
        String s1="hello";
        String s2= "Hello";
        System.out.println(s2.equals(s1));//Returns true if this string is equal to string s1.
        System.out.println(s2.equalsIgnoreCase(s2));//Returns true if this string is equal to string s1; it is case insensitive.
        System.out.println(s2.compareTo(s2));//Returns an integer greater than 0, equal to 0, or less than 0 to indicate whether this string is greater than, equal to, or less than s1.
        System.out.println(s2.compareToIgnoreCase(s2));//Same as compareTo except that the comparison is case insensitive.





    }
    

    
}
