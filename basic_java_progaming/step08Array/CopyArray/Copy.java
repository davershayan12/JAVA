package basic_java_progaming.step08Array.CopyArray;

public class Copy {
    public static void main(String[] args){
        int[] numbers1=new int[5];
        int[] numbers2=new int[5];
        for(int i=0;i<5;i++){
            numbers1[i]=i;
        } 
        System.arraycopy(numbers1, 0, numbers2, 0, numbers1.length);
        System.out.println("The number2:");
        for(int i: numbers2){
            System.out.print(i);
        }
        System.out.println();
    }
    
}
